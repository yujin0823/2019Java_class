package gondr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Downloader {

	public void download(String addr, String target) {
		try {
			Document doc = Jsoup.connect(addr).get();
			Elements imgs = doc.select("img[src~=img-comic]");
			//src 속성에 img-comic 이라는 글자를 포함하는 모든 img태그를 가져옴.
			
			for(int i = 0; i < imgs.size(); i++) {
				String src = imgs.get(i).attr("src"); //src속성만 따로 가져옴.
				
				imgDown(addr, target, src, i+1);
				
				System.out.println("현재 총 " + imgs.size() + "개 중 " + (i+1) + "개 다운로드 완료");
			}
		} catch (Exception e) {
			System.out.println("다운로드중 오류발생 url 확인필요");
		}
	}
	
	private void imgDown(String addr, String target, String src, int page) {
		
		try {
			int idx = src.lastIndexOf("."); //url에서 마지막 .의 위치 가져오기
			String ext = src.substring(idx); //.의 위치부터 글자를 잘라 확장자 가져오기
			
			File saveFile = new File(target + File.separator + page + ext);
			//저장할 파일 생성자를 만들고
			FileOutputStream fos = new FileOutputStream(saveFile);
			//해당 파일에 대한 아웃 스트림을 열어준다.
			
			HttpURLConnection conn = (HttpURLConnection)new URL(src).openConnection();
			//HttpURLConnection 인터넷 연결을 열어줌 연결해줌으로써 InputStream뽑아옴
			conn.setConnectTimeout(40000); //최대 한 파일당 40초까지 기다려줌
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Referer", addr);
			//이 속성을 안해주면 네이버에서는 이전에 웹툰을 보다가 접근한 것이 아니라고 판단하고 요청을 거부함.
			conn.setRequestProperty("User-Agent", "Mozilla/5.0");
			
			InputStream in = conn.getInputStream();
			
			byte[] buffer = new byte[1024*1024]; //1kb 크기로 버퍼 설정해서 받음.
			int len = 0; //읽어온 바이트 수
			while(true) {
				len = in.read(buffer);
				if(len <= 0) {
					break;
				}
				fos.write(buffer, 0, len);
			}
			fos.close();
			in.close();
			
		} catch (Exception e) {
			System.out.println(page + "번 이미지 다운중 오류 발생");
		}
	}

}

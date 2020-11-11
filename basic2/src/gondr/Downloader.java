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
			//src �Ӽ��� img-comic �̶�� ���ڸ� �����ϴ� ��� img�±׸� ������.
			
			for(int i = 0; i < imgs.size(); i++) {
				String src = imgs.get(i).attr("src"); //src�Ӽ��� ���� ������.
				
				imgDown(addr, target, src, i+1);
				
				System.out.println("���� �� " + imgs.size() + "�� �� " + (i+1) + "�� �ٿ�ε� �Ϸ�");
			}
		} catch (Exception e) {
			System.out.println("�ٿ�ε��� �����߻� url Ȯ���ʿ�");
		}
	}
	
	private void imgDown(String addr, String target, String src, int page) {
		
		try {
			int idx = src.lastIndexOf("."); //url���� ������ .�� ��ġ ��������
			String ext = src.substring(idx); //.�� ��ġ���� ���ڸ� �߶� Ȯ���� ��������
			
			File saveFile = new File(target + File.separator + page + ext);
			//������ ���� �����ڸ� �����
			FileOutputStream fos = new FileOutputStream(saveFile);
			//�ش� ���Ͽ� ���� �ƿ� ��Ʈ���� �����ش�.
			
			HttpURLConnection conn = (HttpURLConnection)new URL(src).openConnection();
			//HttpURLConnection ���ͳ� ������ ������ �����������ν� InputStream�̾ƿ�
			conn.setConnectTimeout(40000); //�ִ� �� ���ϴ� 40�ʱ��� ��ٷ���
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Referer", addr);
			//�� �Ӽ��� �����ָ� ���̹������� ������ ������ ���ٰ� ������ ���� �ƴ϶�� �Ǵ��ϰ� ��û�� �ź���.
			conn.setRequestProperty("User-Agent", "Mozilla/5.0");
			
			InputStream in = conn.getInputStream();
			
			byte[] buffer = new byte[1024*1024]; //1kb ũ��� ���� �����ؼ� ����.
			int len = 0; //�о�� ����Ʈ ��
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
			System.out.println(page + "�� �̹��� �ٿ��� ���� �߻�");
		}
	}

}

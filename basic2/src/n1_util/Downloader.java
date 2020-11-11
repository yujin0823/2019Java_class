package n1_util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Downloader {
	public static void down(String url, String toonNo) {
		try {
			Document doc = Jsoup.connect(url).get();
			Elements imgList = doc.select(".wt_viewer img");
			
			File indexFile = new File("data/" + toonNo + "/index.html");
			FileOutputStream indexOut = new FileOutputStream(indexFile);
			OutputStreamWriter osw = new OutputStreamWriter(indexOut);
			BufferedWriter bw = new BufferedWriter(osw);
			
			for(int i = 0; i < imgList.size(); i++) {
				Element img = imgList.get(i);
				String src = img.attr("src");
				String number = "0000" + i;
				
				String filename = number.substring(number.length() - 4) + ".jpg";
				
				bw.write("<img src='" + filename +"'><br>");
				
				File downFile = new File("data/"+ toonNo + "/" + filename);
				FileOutputStream fos = new FileOutputStream(downFile);
				
				HttpURLConnection conn = (HttpURLConnection)new URL(src).openConnection();
				conn.setRequestProperty("Referer", url);
				conn.setRequestProperty("User-Agent", "Mozilla/5.0");
				
				InputStream is = conn.getInputStream();
				
				byte[] b = new byte[1024 * 1024];
				
				int len = 0;
				while(true) {
					len = is.read(b);
					if(len <= 0) {
						break;
					}
					fos.write(b, 0, len);
				}
				fos.close();
				is.close();
			}
			
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
		}
	}
}

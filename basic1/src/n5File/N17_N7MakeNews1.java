package n5File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class N17_N7MakeNews1 {
	public static void main(String[] args) {
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<String> links = new ArrayList<>();
		
		try {
			String url = "https://news.google.com/rss?hl=ko&gl=KR&ceid=KR:ko";
			Document doc = Jsoup.connect(url).get();
			Elements list = doc.select("item");
			
			for(int i = 0; i < list.size(); i++) {
				Element item = list.get(i);
				String title = item.selectFirst("title").text();
				String link = item.selectFirst("link").text();
				
				titles.add(title);
				links.add(link);
			}
			
			int googleCnt = list.size() - 1;
			
			/*System.out.println("jtbc");*/
			
			url = "http://fs.jtbc.joins.com//RSS/sports.xml";
			doc = Jsoup.connect(url).get();
			list = doc.select("item");
			
			for(int i = 0; i < list.size(); i++) {
				Element item = list.get(i);
				String title = item.selectFirst("title").text();
				String link = item.selectFirst("link").text();
				
				titles.add(title);
				links.add(link);
			}
			
			
			File outFile = new File("data/news2.html");
			
			FileOutputStream fos = new FileOutputStream(outFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("<h1>구글 뉴스</h1>");
			for(int i = 0; i < titles.size(); i++) {
				String title = titles.get(i);
				String link = links.get(i);
				
				String tag 
					= "<a href='" + link + "'>" + title +"</a><br>";
				
				bw.write(tag);
				bw.newLine();
				if(i == googleCnt) {
					bw.write("<h1>JTBC 뉴스</h1>");
				}
			}
			
			bw.close();
			osw.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
		}
		
		
	}
}

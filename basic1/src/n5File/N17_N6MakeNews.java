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

public class N17_N6MakeNews {
	public static void main(String[] args) {
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<String> links = new ArrayList<>();
		
		try {
			String url = "https://news.google.com/rss?hl=ko&gl=KR&ceid=KR:ko";
			String url2 = "http://fs.jtbc.joins.com//RSS/entertainment.xml";
			
			Document doc = Jsoup.connect(url).get();
			Document doc2 = Jsoup.connect(url2).get();
			Elements list = doc.select("item");
			Elements list2 = doc2.select("item");
			
			/*구글*/
			for(int i = 0; i < list.size(); i++) {
				Element item = list.get(i);
				String title = item.selectFirst("title").text();
				String link = item.selectFirst("link").text();
				
				titles.add(title);
				links.add(link);
			}
			
			/*jtbc*/
			System.out.println();
			for(int i = 0; i < list2.size(); i++) {
				Element item = list2.get(i);
				String title = item.selectFirst("title").text();
				String link = item.selectFirst("link").text();
				
				titles.add(title);
				links.add(link);
			}
			
			File outFile = new File("data/news.html");
			
			FileOutputStream fos = new FileOutputStream(outFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			for(int i = 0; i < titles.size(); i++) {
				String title = titles.get(i);
				String link = links.get(i);
				
				String tag 
					= "<a href='" + link + "'>" + title +"</a><br>";
				
				bw.write(tag);
				bw.newLine();
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

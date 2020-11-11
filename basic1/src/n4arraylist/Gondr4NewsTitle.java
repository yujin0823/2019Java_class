package n4arraylist;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Gondr4NewsTitle {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://news.google.com/news/rss?ned=kr&gl=KR&hl=ko").get();
			Elements newsList = doc.select("item");
			
			for (Element item : newsList) {
				Element title = item.selectFirst("title");
				Element pubDate = item.selectFirst("pubDate");
						
				System.out.println(title.text() + ", [" + pubDate.text() + "]");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터 가져오기 실패");
		}

	}

}

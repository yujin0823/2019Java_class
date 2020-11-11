package n4arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class N16_N4NewsList1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		try {
			String url = "https://news.google.com/rss?hl=ko&gl=KR";
			Document doc = Jsoup.connect(url).get();
			Elements list = doc.select("item");
			ArrayList<String> hatenews = new ArrayList<String>();
			
			int cnt = 0;
			System.out.println("싫어하는 언론사입력");
			while (true) {
				String hate = in.nextLine();
				
				if (hate.isEmpty()) {
					break;
				}
				
				hatenews.add(hate);
			}
			
			System.out.print("위 결과에서 ");
			for (int i=0; i<hatenews.size(); i++) {
				System.out.print(hatenews.get(i)+" ");
			}
			System.out.println("를 거릅니다");
			
			for (int i=0; i<list.size(); i++) {
				Element item = list.get(i);
				String title = item.selectFirst("title").text();
				String source = item.selectFirst("source").text();
				
				cnt = 0;
				
				for (int j=0; j<hatenews.size(); j++) {
					if (!source.equals(hatenews.get(j))) {
						cnt++;
					} 
				}
				
				if (cnt == hatenews.size()) {
					System.out.println(title);
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류");
		}

	}
}

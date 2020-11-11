package n4arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class N16_N4NewsList2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		try {
			String url = "https://news.google.com/rss?hl=ko&gl=KR";
			Document doc = Jsoup.connect(url).get();
			Elements list = doc.select("item");
			ArrayList<String> hate = new ArrayList<String>();
			
			//System.out.println(list);
			System.out.println("싫어하는 언론사를 입력해주세요");
			
			while (true) {
				String h2 = in.nextLine();
				
				if (h2.equals("")) {
					break;
				}
				hate.add(h2);
			}

			int cnt = 0;
			
			System.out.print("결과에서 ");
			for (int i=0; i<hate.size(); i++) {
				System.out.print(hate.get(i)+" ");
			}
			System.out.println("는 거릅니다");

			for (int i = 0; i < list.size(); i++) {
				Element item = list.get(i);
				String title = item.selectFirst("title").text();
				String source = item.selectFirst("source").text();
				String pubDate = item.selectFirst("pubDate").text();
				String link = item.selectFirst("link").text();

				// System.out.println(title);

				cnt = 0;
				
				for(int j = 0; j < hate.size(); j++) {
					if (!source.equals(hate.get(j))) {
						cnt++;
					} 
				}
				
				if(cnt == hate.size()) {
					System.out.print(title);
					System.out.println(" ["+pubDate+"]");
					System.out.println(link);
				}
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

package n4arraylist;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class N16_N4NewsList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println(title); ��������
//		System.out.println(source);��л�

		try {
			String url = "https://news.google.com/rss?hl=ko&gl=KR";
			Document doc = Jsoup.connect(url).get();
			Elements list = doc.select("item");
			
			System.out.println("�Ⱦ��ϴ� ��л��Է�");
			String hate = in.nextLine();
			int cnt = 0;
			
			for (int i=0; i<list.size(); i++) {
				Element item = list.get(i);
				String title = item.selectFirst("title").text();
				String source = item.selectFirst("source").text();
				
				if (!hate.contains(source)) {
					System.out.println(title);
				}else {
					cnt++;
				}
			}
	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����߻�");
		}

	}
}
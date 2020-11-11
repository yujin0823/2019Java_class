package n4arraylist;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class N16NewsList {

	public static void main(String[] args) {
		try {
			String url = "https://news.google.com/rss?hl=ko&gl=KR&ceid=KR:ko";

			Document doc = Jsoup.connect(url).get();

			Elements list = doc.select("item");

			Scanner in = new Scanner(System.in);
			System.out.println("�Ⱦ��ϴ� ��л縦 �Է����ּ���");
			String hate = in.nextLine();
			
			
			int cnt = 0;
			for (int i = 0; i < list.size(); i++) {
				Element item = list.get(i);
				String title = item.select("title").text();
				String source = item.select("source").text();

				if (!hate.equals(source)) {
					System.out.println(title);
				} else {
					cnt++;
				}

			}

			System.out.println(list.size() + "���� ������ " + cnt + "�� �ɷ���");

			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� �߻�");
		}

	}

}

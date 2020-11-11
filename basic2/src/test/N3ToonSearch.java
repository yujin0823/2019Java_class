package test;

import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import tmodel.Toon;

public class N3ToonSearch {
	public static void main(String[] args) {
		String url = "https://comic.naver.com/webtoon/weekday.nhn";
		ArrayList<Toon> toonList = new ArrayList<>();
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements list = doc.select(".list_area .col_inner li > a");

			for (Element item : list) {
				String href = item.attr("href"); // href �Ӽ� ����/
				int start = href.indexOf("titleId=");
				int end = href.indexOf("&");
				String toonId = href.substring(start + 8, end);
				String name = item.text();

				Toon toon = new Toon(name, toonId);
				toonList.add(toon);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ũ�Ѹ��� ���� �߻�");
		}

		Scanner in = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� ������ �̸��� �Է��ϼ��� ");
		String name = in.nextLine();

		// �̰��� ������ �ڵ带 �ۼ�
		for (Toon toon : toonList) {
			if (toon.checkContain(name)) {
				System.out.println(toon);
			}
		}
	}
}
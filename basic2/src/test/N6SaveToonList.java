package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import tmodel.Toon6;

public class N6SaveToonList {

	public static void main(String[] args) {
		// 네이버 요일별웹툰 메인페이지
		String url = "https://comic.naver.com/webtoon/weekday.nhn";
		
		ArrayList<Toon6> toonList = new ArrayList<>();
		ArrayList<String> datalist = new ArrayList<>();
		File saveFile = new File("toonData.txt");

		try {
			Document doc = Jsoup.connect(url).get();
			Elements list = doc.select(".list_area .col_inner li > a");

			for (Element item : list) {
				Elements img = doc.select("li > .thumb > img");
				String href = item.attr("href"); // href 속성 빼옴/
				int start = href.indexOf("titleId=");
				int end = href.indexOf("&");

				String toonId = href.substring(start + 8, end);
				String name = item.text();
				String src = img.attr("src");

				boolean find = false;

				for (Toon6 toon : toonList) {
					if (toon.toonId.equals(toonId)) {
						find = true;
						break;
					}
				}

				if (!find) {
					datalist.add(name + "#" + toonId + "#" + src);
					Toon6 toon = new Toon6(name, toonId, src);
					toonList.add(toon);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("크롤링중 오류 발생");
		}

		int cnt = 0;
		Toon6 findToon = null;
		for (Toon6 toon : toonList) {

			try {
				FileOutputStream fos = new FileOutputStream(saveFile);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);

				for (String item : datalist) {
					bw.write(item);
					bw.newLine();
				}

				bw.flush(); // 이작업을 해야 실제로 기록된다.

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("기록중 오류발생");
			}

		}

	}

}
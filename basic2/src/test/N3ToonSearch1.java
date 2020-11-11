package test;

import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import tmodel.Toon1;

public class N3ToonSearch1 {
	public static void main(String[] args) {
		String url = "https://comic.naver.com/webtoon/weekday.nhn";
		
		ArrayList<Toon1> toonList = new ArrayList<>();
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements list = doc.select(".list_area .col_inner li > a");
			
			///webtoon/list.nhn?titleId=183559&weekday=mon
			for(Element item : list) {
				String href = item.attr("href");
				int start = href.indexOf("titleId=");
				int end = href.indexOf("&");
				String id = href.substring(start + 8, end);
				String name = item.text();
				
				boolean find = false;
				for(Toon1 toon : toonList) {
					if(toon.checkEqual(id)) {
						find = true;
						break;
					}
				}
				
				if(!find) {
					Toon1 toon = new Toon1(name, id);
					toonList.add(toon);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println("검색하고자 하는 웹툰을 입력하세요");
		String name = in.nextLine();
		
		for(Toon1 toon : toonList) {
			if(toon.checkContain(name)) {
				System.out.println(toon);
			}
		}
		
	}
}

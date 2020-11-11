package main;

import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import model.Toon;

public class N6_ToonSearch {
	public static void main(String[] args) {
		String url = "https://comic.naver.com/webtoon/weekday.nhn";
		
		ArrayList<Toon> toonList = new ArrayList<>();
		
		try {
			Document doc = Jsoup.connect(url).get();	
			Elements list = doc.select(".list_area .col_inner li > a");
			
			for(Element item : list) {
				String href = item.attr("href");
				int start = href.indexOf("titleId=");
				int end = href.indexOf("&");
				String id = href.substring(start + 8, end);
				String name = item.text();
				
				boolean find = false;
				for(Toon toon : toonList) {
					if(toon.checkEqual(id)) {
						find = true;
						break;
					}
				}
				
				if(!find) {
					Toon toon = new Toon(name, id);
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
		
		int cnt = 0;
		Toon findToon = null;
		for(Toon toon : toonList) {
			if(toon.checkContain(name)) {
				System.out.println(toon);
				findToon = toon;
				cnt++;
			}
		}
		
		System.out.println("검색결과 " + cnt + "개가 나왔습니다.");
		
		if(cnt == 1) {
			Downloader d = new Downloader();
			System.out.println(findToon.getName() +"을 다운받습니다.");
			
			System.out.println("몇회를 다운받으실래요?");
			String no = in.nextLine();
			
			d.download(findToon.getId(), no, "data");
			
			System.out.println("다운로드 완료");
		}
	}
}

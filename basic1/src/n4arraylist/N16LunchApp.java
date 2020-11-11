package n4arraylist;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class N16LunchApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			String url = "http://www.y-y.hs.kr/lunch.list?ym=201904";
			Document doc = Jsoup.connect(url).get();
			
			Elements list = doc.select(".normal .tabContent > span > a");
			
			System.out.println("좋아하는 메뉴를 입력하세요");
			
			String menu = in.nextLine();
			int cnt = 0;
			for(int i = 0; i < list.size(); i++) {
				String temp = list.get(i).text();
				
				if(temp.contains(menu)) {
					cnt++;
				}
			}
			
			System.out.println("야호! 이번달에는 "+menu + "이(가) " + cnt + "번 나와요");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

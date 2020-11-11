package n4arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class N16_N3FavorLunch1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		try {
			Document doc = Jsoup.connect("http://www.y-y.hs.kr/lunch.list?ym=201905").get();
			Elements menus = doc.select(".normal .tabContent > span > a");
			ArrayList<String> favormenus = new ArrayList<String>();
			
			System.out.println("좋아하는 메뉴를 입력하세요");
			String favor = in.nextLine();
			int cnt = 0;
			
			for (int i=0; i<menus.size(); i++) {
				String temp = menus.get(i).text();
				if (temp.contains(favor)) {
					cnt++;
					favormenus.add(temp);
				}
			}
			
			if (cnt==0) {
				System.out.println("아이고 유감ㅠㅠ 이번달에는 "+favor+"이 안나와요");
			}else {
				System.out.println("야호!! 이번달에 "+favor+"이(가) "+cnt+"번 나옵니다");
				for (int i=0; i<favormenus.size(); i++) {
					System.out.println(favormenus.get(i));
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류");
		}
	
	}

}
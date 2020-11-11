package n4arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class N16_N3FavorLunch2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		try {
			System.out.println("년도와 월입력");
			String date = in.nextLine();
			Document doc = Jsoup.connect("http://www.y-y.hs.kr/lunch.list?ym="+date).get();
			Elements menus = doc.select(".normal .tabContent > span > a");
			ArrayList<String> favormenu = new ArrayList<String>();
			
			int cnt = 0;
			System.out.println("좋아하는 메뉴를 입력하세요");
			String favor = in.nextLine();
			
			for (int i=0; i<menus.size(); i++) {
				String temp = menus.get(i).text();
				
				if (temp.contains(favor)) {
					cnt++;
					favormenu.add(temp);
				}
			}
			
			if (cnt==0) {
				System.out.println("이런 이번달에 "+favor+"는(은) 나오지않아요");
			}else {
				System.out.println("야호! 이번달에 "+favor+"이(가) "+cnt+"번 나와요");
				for (int i=0; i<favormenu.size(); i++) {
					System.out.println(favormenu.get(i));
				}
			}
	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류발생");
		}
		
	}

}
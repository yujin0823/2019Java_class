
package n4arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class N16_N3FavorLunch3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		try {
			System.out.println("년도와 월을 입력하세요");
			String date =in.nextLine();
			Document doc = Jsoup.connect("http://www.y-y.hs.kr/lunch.list?ym="+date).get();
			Elements menus  = doc.select(".normal .tabContent > span > a");
			ArrayList<String> favormenu = new ArrayList<String>();
			ArrayList<String> day = new ArrayList<String>();
			
			int cnt  = 0; 
			System.out.println("좋아하는 메뉴를 입력하세요");
			String favor = in.nextLine();
			for(int i = 0; i < menus.size(); i++) {
				String temp = menus.get(i).text();
				
				if (temp.contains(favor)) {
					cnt++;
					favormenu.add(temp);
				}
			}
			
			if (cnt==0) {
				System.out.println("이런 이번달에는 "+favor+"은(는) "+"안나와요");
			}else {
				System.out.println("야호!"+ date +"에는 "+favor+"이(가) "+cnt+"번 나와요");
				for (int i=0; i<favormenu.size(); i++) {
					System.out.println(favormenu.get(i));
				}
			}
			
		} catch (Exception e) {
			System.out.println("값을 가져오는 중 오류가 발생했습니다");
			e.printStackTrace();
		}

	}

}
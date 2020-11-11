package n4arraylist;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Gondr3LunchList {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://www.y-y.hs.kr/lunch.list?ym=201905").get();
			Elements menus = doc.select(".normal .tabContent > span > a");
			
			for (int i=0; i<menus.size(); i++) {
				System.out.println(menus.get(i).text());
			}
	
		} catch (Exception e) {
			System.out.println("값을 가져오지못함");
			e.printStackTrace();
		}

	}

}

package n1main;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class N9Lunch {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("날짜를 입력 ex)20190319");
		String day = in.next();
		
		String url
			="http://y-y.hs.kr/lunch.view?date="+day;
		
		try {
			Document doc = Jsoup.connect(url).get();
			//System.out.println(doc.html());
			
			Element span = doc.selectFirst(".menuName span");
			
			System.out.println(span.html());
			
		}catch (Exception e) {
			
		}
	}

}

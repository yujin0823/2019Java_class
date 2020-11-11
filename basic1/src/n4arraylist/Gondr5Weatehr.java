package n4arraylist;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Gondr5Weatehr {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=109").get();
			Elements weatherList = doc.select("location:nth-child(29) data");
			
			for (Element data : weatherList) {
				Element weather = data.selectFirst("wf");
				Element time = data.selectFirst("tmEf");
				Element maxTemp = data.selectFirst("tmx");
				Element minTemp = data.selectFirst("tmn");
				
				System.out.println(
						"["+time.text()+"]"
						+ "최고기온 : "+ maxTemp.text()
						+ ", 최저기온 : "+ minTemp.text()
						+ ", 날씨 : "+ weather.text());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터 가져오기 실패");
		}

	}

}

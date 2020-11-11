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
						+ "�ְ��� : "+ maxTemp.text()
						+ ", ������� : "+ minTemp.text()
						+ ", ���� : "+ weather.text());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("������ �������� ����");
		}

	}

}

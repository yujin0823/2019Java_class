package n5File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GondrNewsFlash {

	public static void main(String[] args) {
		ArrayList<String> titles = new ArrayList<String>();
		ArrayList<String> links = new ArrayList<String>();
		
		try {
			Document doc = Jsoup.connect("http://fs.jtbc.joins.com//RSS/newsflash.xml").get();
			Elements items = doc.select("item");
			
			for (int i=0; i<items.size(); i++) {
				Element item = items.get(i);
				String title = item.select("title").first().text(); //������ title�� �����ؼ� text�� ����
				titles.add(title);
				
				String link = item.select("link").first().text(); //������ link�� �����ؼ� text�� ����
				links.add(link);
			}
			
//			for (int i=0; i<titles.size(); i++) {
//				System.out.println(titles.get(i));
//			}
			
			FileOutputStream fos = new FileOutputStream(new File("data/flash.txt"));
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			for (String title : titles) {
				bw.write(title);
				bw.newLine();
			}
			
			bw.close();
			osw.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����");
		}

	}

}

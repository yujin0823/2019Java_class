package gondr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ProjectNewsFlash {

	public static void main(String[] args) {
		ArrayList<ProjectNewsItem> newsItemList = new ArrayList<ProjectNewsItem>();
		
		try {
			Document doc = Jsoup.connect("http://fs.jtbc.joins.com//RSS/newsflash.xml").get();
			Elements items = doc.select("item");
			
			for (int i=0; i<items.size(); i++) {
				ProjectNewsItem item = new ProjectNewsItem();
				item.setDate(items.get(i));
				
				newsItemList.add(item); //리스트에 뉴스 아이템을 넣어줌
			}
			
			FileOutputStream fos = new FileOutputStream(new File("data/flash.html"));
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			for (int i=0; i<newsItemList.size(); i++) {
				bw.write(newsItemList.get(i).getTagItem());
				bw.newLine();
			}
			bw.flush();
			System.out.println("모든 기록이 완료되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				

	}

}

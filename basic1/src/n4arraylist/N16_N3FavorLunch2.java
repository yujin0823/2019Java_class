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
			System.out.println("�⵵�� ���Է�");
			String date = in.nextLine();
			Document doc = Jsoup.connect("http://www.y-y.hs.kr/lunch.list?ym="+date).get();
			Elements menus = doc.select(".normal .tabContent > span > a");
			ArrayList<String> favormenu = new ArrayList<String>();
			
			int cnt = 0;
			System.out.println("�����ϴ� �޴��� �Է��ϼ���");
			String favor = in.nextLine();
			
			for (int i=0; i<menus.size(); i++) {
				String temp = menus.get(i).text();
				
				if (temp.contains(favor)) {
					cnt++;
					favormenu.add(temp);
				}
			}
			
			if (cnt==0) {
				System.out.println("�̷� �̹��޿� "+favor+"��(��) �������ʾƿ�");
			}else {
				System.out.println("��ȣ! �̹��޿� "+favor+"��(��) "+cnt+"�� ���Ϳ�");
				for (int i=0; i<favormenu.size(); i++) {
					System.out.println(favormenu.get(i));
				}
			}
	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����߻�");
		}
		
	}

}
package n4arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Gondr2ArrayListTest1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		while (true) {
			String temp = in.nextLine();
			
			if (temp.isEmpty()) {
				break;
			}
			list.add(temp);
		}
		
		String value = in.nextLine();
		for(int i =0; i < list.size(); i++) {
			if(list.get(i).equals(value) ) {
				list.remove(i);
				break;
			}
		}
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}

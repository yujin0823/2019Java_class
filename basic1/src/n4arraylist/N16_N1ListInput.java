package n4arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class N16_N1ListInput {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("수를 입력하세요");
		while (true) {
			int num = in.nextInt();
			
			if (num==0) {
				break;
			}
			
			list.add(num);
		}
		
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}

	}

}
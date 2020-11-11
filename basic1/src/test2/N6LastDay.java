package test2;

import java.util.Scanner;

public class N6LastDay {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int year = in.nextInt();
		int month = in.nextInt();

		// 1 3 5 7 8 10 12
		
		if ((month<=7 && month%2==1) || (month>=8 && month%2==0)) {
			System.out.println("31");
		}else if (month==2) {
			if ((year%4==0 && year%100!=0) || year%400==0) {
				System.out.println("29");
			}else {
				System.out.println(28);
			}
		}else {
			System.out.println(30);
		}
		
	}

}

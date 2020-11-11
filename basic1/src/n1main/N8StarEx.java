package n1main;

import java.util.Scanner;

public class N8StarEx {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/*문제7*/
		
		System.out.println("숫자를 입력하세요");
		int num3 = in.nextInt();
		
		for(int i=0; i< num3; i++) {
			System.out.println("*****");
		}
		
		/*문제8*/
		
		System.out.println("정수를 입력하세요");
		int num = in.nextInt();
		
		for (int i=0; i < num; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		/*반대로*/
		
		System.out.println("정수를 입력하세요");
		int num2 = in.nextInt();

		for (int i = 0; i < num2; i++) {

			for (int j = 0; j < num2 - i - 1; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}

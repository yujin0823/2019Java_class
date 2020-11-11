package test2;

import java.util.Scanner;

public class N9Pyramid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("층수를 입력하세요");
		int floor = in.nextInt();
		
		for (int i=1; i<=floor; i++) {
			for (int j=1; j<=floor-i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}

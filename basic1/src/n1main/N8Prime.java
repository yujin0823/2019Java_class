package n1main;

import java.util.Scanner;

public class N8Prime {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/*소수구하기*/
		
		for (int i = 2; i <= 100; i++) {
			boolean prime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}

			if (prime == true) {
				System.out.println(i);
			}
		}
		

		/*입력한 값까지의 소수 합*/
		
		System.out.println("수를 입력하세요");
		int sum = 0;
		int num = in.nextInt();
		
		for (int i = 2; i <= num; i++) {
			boolean prime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}

			if (prime == true) {
				//System.out.println(i);
				sum = sum+i;
			}
		}
		System.out.println(sum);

	}

}

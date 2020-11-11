package test2;

import java.util.Scanner;

public class N3Double {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/* 문제3-5개입력후 짝수만 더하기 */

		int sum = 0;
		System.out.println("5개 값 입력");

		for (int i = 1; i <= 5; i++) {
			int num = in.nextInt();

			if (num % 2 == 0) {
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}

}

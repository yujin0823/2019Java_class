package test2;

import java.util.Scanner;

public class N3Double {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/* ����3-5���Է��� ¦���� ���ϱ� */

		int sum = 0;
		System.out.println("5�� �� �Է�");

		for (int i = 1; i <= 5; i++) {
			int num = in.nextInt();

			if (num % 2 == 0) {
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}

}

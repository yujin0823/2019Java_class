package main;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("숫자를 입력해주세요.");
		int num = in.nextInt();
		int len = 1;
		int blank = 0;
		for (int i = 2; i < num; i++)
			len += 2;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < blank; j++)
				System.out.print(" ");
			for (int j = 0; j < num; j++) {
				if (i == 0)
					System.out.print("*");
				else {
					if (j == 0 || j == num - 1) {
						if (i == num - 1 && j == num - 1)
							continue;
						System.out.print("*");
					} else
						System.out.print(" ");
				}
			}
			for (int j = 0; j < len; j++)
				System.out.print(" ");
			blank++;
			len -= 2;
			for (int j = 0; j < num; j++) {
				if (i == 0)
					System.out.print("*");
				else {
					if (j == 0 || j == num - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		len = 1;
		blank--;
		for (int i = 0; i < num - 1; i++) {
			blank--;
			for (int j = 0; j < blank; j++)
				System.out.print(" ");
			for (int j = 0; j < num; j++) {
				if (i == num - 2)
					System.out.print("*");
				else {
					if (j == 0 || j == num - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			for (int j = 0; j < len; j++)
				System.out.print(" ");
			for (int j = 0; j < num; j++) {
				if (i == num - 2)
					System.out.print("*");
				else {
					if (j == 0 || j == num - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
			len += 2;
		}

	}
}

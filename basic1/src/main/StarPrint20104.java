package main;

import java.util.Scanner;

public class StarPrint20104 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("숫자를 입력해주세요.");
		int num = in.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == j) {
					System.out.print("*");
				} else if ((i + j) == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

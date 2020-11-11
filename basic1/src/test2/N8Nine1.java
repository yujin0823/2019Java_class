package test2;

import java.util.Scanner;

public class N8Nine1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("단을 입력하세요");
		int dan = in.nextInt();
		
		System.out.println(dan+"단 출력");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan+"X"+i+"="+dan*i);
		}

	}

}

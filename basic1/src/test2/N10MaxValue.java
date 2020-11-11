package test2;

import java.util.Scanner;

public class N10MaxValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요");

		int max = 0;

		while (true) {
			int num = in.nextInt();
			
			if (num>max) {
				max = num;
			}
			
			if (num<0) {
				break;
			}
			
		}
		System.out.println("최대값 : "+max);
	}

}

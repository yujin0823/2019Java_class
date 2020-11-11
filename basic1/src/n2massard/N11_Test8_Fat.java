package n2massard;

import java.util.Scanner;

public class N11_Test8_Fat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("키를 입력하세요");
		double tall = in.nextInt();
		System.out.println("몸무게를 입력하세요");
		double kg = in.nextInt();

		double w2 = (tall - 100) * 0.9; // 표준 몸무게 구하기
		double fat = (kg - w2) * 100 / w2;

		if (fat <= 10) {
			System.out.println(fat + " : 정상입니다");
		} else if (fat <= 20) {
			System.out.println(fat + " : 과체중입니다");
		} else if (fat > 20) {
			System.out.println(fat + " : 비만입니다");
		}

	}

}

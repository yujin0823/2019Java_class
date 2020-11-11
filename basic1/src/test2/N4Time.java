package test2;

import java.util.Scanner;

public class N4Time {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/* 문제4-초단위 정수입력후 시간출력(조건-초는21억을 넘기지않는다) */
		
		System.out.println("정수를 입력하세요");
		
		int time = in.nextInt();
		int h = time/3600;
		int m = (time%3600)/60;
		int s = time%60;
		
		System.out.println(h+"시"+m+"분"+s);
	}

}

package n1main;

import java.util.Scanner;

public class N6WhileTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("숫자를 입력하세요");
		while(sum <=1000) {
			int value = in.nextInt();
			
			if(value<0) {
				break;
			}
			sum = sum + value;
//			System.out.println("현재까지 합:"+ sum);
			
			//합이 1000넘어가면 정지
//			if (sum>1000) {
//				break;
//			}
		}
		System.out.println("현재까지 합:"+ sum);
		System.out.println("평균");

	}

}

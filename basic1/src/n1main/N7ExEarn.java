package n1main;

import java.util.Scanner;

public class N7ExEarn {

	public static void main(String[] args) {
		//사용자로 부터 계속 입력을 받아야함 입력된 값의 합 100넘을때 까지	
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		while(sum<=100) {
			System.out.println("경험치를 입력하세요");
			int num = in.nextInt();
			sum = sum+num;
			System.out.println("현재 합:"+sum);
		}
		
		System.out.println("최종합 :"+sum);
	}

}

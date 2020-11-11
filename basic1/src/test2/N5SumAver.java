package test2;

import java.util.Scanner;

public class N5SumAver {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/* 문제5-0이 입력되면 종료 -->합과평균구하기 */
		
		System.out.println("정수를 입력하세요");
		
		double sum = 0;
		double avg = 0;
		int count = 0;
		
		while (true) {
			int num = in.nextInt();
			
			if (num==0) {
				break;
			}
			count ++;
			sum = sum + num;
			avg = sum / count;
		}
		System.out.println("합계 : "+sum+", 평균 : "+avg);
		
		
	}

}

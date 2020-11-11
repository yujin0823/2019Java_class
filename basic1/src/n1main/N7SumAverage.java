package n1main;

import java.util.Scanner;

public class N7SumAverage {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int sum = 0;
		int count = 0;
		
		while(true) {
			System.out.println("값을 입력하세요");
			int num = in.nextInt();
			
			if(num<0) {
				break;
			}
			count++;
			sum = sum+num;
			
		}
		
		System.out.println("합계 :" + sum + "평균:" +((double)sum/count));

	}

}

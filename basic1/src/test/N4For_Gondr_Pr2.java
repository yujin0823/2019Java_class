package test;

import java.util.Scanner;

public class N4For_Gondr_Pr2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/*문제1-6까지합*/
		
//		int sum = 0;
//		for(int i=1; i<=6 ; i++) {
//			sum = sum+i;
//			System.out.println(sum);
//		}
//		System.out.println("합 : "+sum);
		
		
		/*문제2-3의배수*/
		
//		System.out.println("수를 입력하세요");
//		int num = in.nextInt();
//		
//		for (int i=1 ; i<=num ; i++) {
//			if(i%3==0) {
//				System.out.println(i);
//			}
//		}
		
		
		/*문제3-100넘을때까지*/
		
//		int sum = 0;
//		
//		while(true) {
//			int num = in.nextInt();
//			sum = sum+num;
//			
//			if(sum>=100) {
//				break;
//			}
//			System.out.println("합 : "+sum);
//		}
//		System.out.println("합 : "+sum);
		
		
		/*문제4-음수이전까지의 합과평균*/
		
		int sum = 0;
		int avg = 0;
		int count = 0;
		
		while(true) {
			int num = in.nextInt();
			
			if(num<0) {
				break;
			}
			count++;
			sum = sum+num;
			avg = sum/count;
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		
	}

}

package test;

import java.util.Scanner;

public class N4For_Pr {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/*문제1-1~100까지 2의 배수이면서 3의배수가 아닌것*/
		
//		for (int i=1; i<=100; i++) {
//			if (i%3!=0 && i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		
		/*문제2-1~100까지 2의배수 더하고 3의배수 빼기*/
		
//		int sum = 0;
//		
//		for (int i=1; i<=100; i++) {
//			if (i%2==0) {
//				sum += i;
//			}else if (i%3==0){
//				sum -= i;
//			}
//		}
//		System.out.println(sum);
		
		
		/*문제3-입력한값까지의 합*/
		
//		int num = in.nextInt();
//		int sum = 0;
//		
//		for (int i=1; i<=num; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
		
		/*문제4-0입력하면종료-->합과평균*/
		
//		int sum = 0;
//		int count = 0;
//		int avg = 0;
//		
//		while (true) {
//			int num = in.nextInt();
//			
//			if (num==0) {
//				break;
//			}
//			count++;
//			sum = sum + num;
//			avg = sum/count;
//		}
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+avg);
		
		
		/*문제5-키보드 5번받고 양수만 더하기*/
		
//		int sum = 0;
//		
//		for (int i=0; i<5; i++) {
//			int num = in.nextInt();
//			
//			if (num>0) {
//				sum = sum + num;
//			}
//		}
//		System.out.println(sum);
		
		
		/*문제6-소수*/
		
//		for (int i=2; i<=100; i++) {
//			boolean prime = true;
//			for (int j=2; j<i; j++) {
//				if (i%j==0) {
//					prime = false;
//					break;
//				}
//			}
//			if(prime == true) {
//				System.out.println(i);
//			}
//		}
		
		
		/*문제7-*****로숫자*/
		
//		int num = in.nextInt();
//		
//		for (int i=0; i<num ;i++) {
//			System.out.println("*****");
//		}
		
		
		/*문제8-*늘리기*/
		
		int num = in.nextInt();
		
		for (int i=0; i<num; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}

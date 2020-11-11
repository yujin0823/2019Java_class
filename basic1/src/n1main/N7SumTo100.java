package n1main;

import java.util.Scanner;

public class N7SumTo100 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/* 1번 */

		// for(int i = 1; i<=100; i++) {
		// if(i%2==0 && i%3!=0) {
		// System.out.println(i);
		// }
		// }

		
		/* 2번 */ // 1683

//		int sum = 0;
//
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				sum += i;
//			} else if (i % 3 == 0) {
//				sum -= i;
//			}	
//		}
//		System.out.println(sum);

		
		/* 3번 */

		// System.out.println("수를 입력하세요");

		// int num = in.nextInt();
		// int sum = 0;
		//
		// for(int i = 1; i<=num ; i++) {
		// sum = sum + i;
		// }
		// System.out.println("합계 :"+sum);

		
		/* 4번 */

		// int sum = 0;
		// int avg = 0;
		// int count = 0;

		// System.out.println("수를 입력하세요");

		// while (true) {
		// int num = in.nextInt();
		//
		// if (num==0) {
		// break;
		// }
		
		// count++;
		// sum = sum+num;
		// avg = sum/count;
		// }
		// System.out.println("합:"+sum);
		// System.out.println("평균 :" + avg);

		
		/* 5번 */
		
//		int sum = 0;
//		for(int i = 0; i<5; i++) {
//			System.out.println("수를 입력하세요");
//			int num = in.nextInt();
//			
//			if (num > 0) {
//				sum += num;
//			}
//		}
//		System.out.println("합계 :"+sum);
		
		
		/*6번*/
		
		for(int i = 2; i<=100; i++) {
			int prime = 1; //1이면 소수 // i는 소수로 과정
			
			for (int j =2; j<i ; j++) {
				if (i%j == 0) {
					prime = 0;
					break;
				}
			}
			
			if(prime == 1) {
				System.out.println(i);
			}
		}
	}

}

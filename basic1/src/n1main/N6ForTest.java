package n1main;

import java.util.Random;
import java.util.Scanner;

public class N6ForTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random gondr = new Random();

		System.out.println("확률을 입력하세요");
		double percent = in.nextDouble();
		System.out.println("실행횟수를 입력하세요");
		int count = in.nextInt();
		int success = 0;
		int fail = 0;

		for (int i = 0; i < count; i++) {
			double number = gondr.nextDouble() * 100;

			if (number < percent) {
				// success증가
				success++;
				
				// System.out.println(number + ": 성공");
			} else {
				// fail증가
				fail++;
				
				// System.out.println(number + ": 실패");
			}
			
			if(fail>=20) {
				break;
			}
		}
		System.out.println("전체" + (success+fail) + "회중" + success + "성공" + fail + "실패");

		/* 입력한 정수까지 1부터의 합 구하기 */

//		long num = in.nextLong();		
//		
//		for(int i=1; i<=num; i++) { //i++ == i=i+1
//			if(i%3 ==0) {
//				System.out.println(i);
//			}
//		}

	}

}

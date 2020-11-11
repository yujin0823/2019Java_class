package n1main;

import java.util.Scanner;

public class N5Test {

	public static void main(String[] args) {
		//System.out.println("등수를 입력하세요");
		Scanner in = new Scanner(System.in);
		
		/*정수 3자리 2자리*/
		
//		System.out.println("수를 입력하세요");
//		int num = in.nextInt();
//		
//		int h = num/100;
//		int t =(num%100)/10;
//		int o = num%10;
//		
//		int ten = num/10;
//		int one = num%10;
//		
//		if (num >= 100 && num <= 999) {
//			System.out.println(o+""+t+""+h);
//		}else if (num >= 10 && num <= 99) {
//			System.out.println(ten+one);
//		}
		
		
		/*정수 실수*/
		
//		System.out.println("수를 입력하세요");
//		
//		double num =  in.nextDouble();
//		if (num % 1 == 0) {
//			System.out.println("정수입니다");
//		}else {
//			System.out.println("실수입니다");
//		}
		
		
		/*두수 비교*/
		
//		System.out.println("첫번째 수를 입력하세요");
//		int number1 = in.nextInt();
//		System.out.println("두번째 수를 입력하세요");
//		int number2 = in.nextInt();
//		
//		if(number1 > number2) {
//			System.out.println("큰수:"+ number1 + "," +"작은수 :" + number2);
//		}else {
//			System.out.println("큰수:"+ number2 + "," +"작은수 :" + number1);
//		}
		
		
		/*등수*/
		
//		int sc = in.nextInt();
//		if (sc<1 && sc<20) {
//			System.out.println("잘못입력했습니다");
//		} else {
//			if (sc == 1) {
//				System.out.println("아주 잘했어요");
//			} else if (sc <= 3) {
//				System.out.println("잘했네요");
//			} else if (sc <= 6) {
//				System.out.println("보통입니다");
//			} else if (sc <= 19) {
//				System.out.println("노력이 필요합니다");
//			}
//		}

		/* 초 */

//		System.out.println("초를 입력하세요");
//		int time = in.nextInt();
//		int h = time/3600;
//		int m = (time%3600)/60;
//		int s = time%60;
//		
//		System.out.println(h + "시간" + m + "분" + s + "초");

		
		/* 이름 */

//		System.out.println("이름을 입력하세요");
//		String name = in.nextLine();
//		
//		if (name.length() >= 5) {
//			System.out.println("너무 깁니다");
//		}else {
//			System.out.println(name + "안녕하세요");
//		}

		
		/* 정수 */

		System.out.println("정수를 입력하세요");
		double number = in.nextDouble();
		
		if(number %2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}

	}

}

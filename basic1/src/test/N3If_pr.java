package test;

import java.util.Scanner;

public class N3If_pr {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/* 문제1-짝수홀수 */

//		System.out.println("수를 입력하세요");
//		int num = in.nextInt();
//		
//		if(num%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
		

		/* 문제2-이름길이 */

//		System.out.println("이름을 입력하세요");
//		String name = in.next();
//
//		if (name.length() >= 5) {
//			System.out.println("너무길어요");
//		} else {
//			System.out.println(name + "안녕하세요");
//		}
		

		/* 문제3-시간 */
		
//		System.out.println("시간을 입력하세요");
//		int time = in.nextInt();
//		int h = time/3600;
//		int m = (time%3600)/60;
//		int s = time%60;
//		
//		System.out.println(h+"시"+m+"분"+s+'초');
		
		
		/* 문제4-등수 */
		
//		System.out.println("등수를 입력하세요");
//		int num = in.nextInt();
//		
//		if(num==1) {
//			System.out.println("아주잘했어요");
//		}else if(num<=3) {
//			System.out.println("잘했네요");
//		}else if(num<=6) {
//			System.out.println("보통이네요");
//		}else if(num<=19) {
//			System.out.println("노력이 필요하네요");
//		}
		
		
		/* 문제5-큰수작은수 */
		
//		System.out.println("수를 입력하세요");
//		int num = in.nextInt();
//		int num2 = in.nextInt();
//		
//		if(num>num2) {
//			System.out.println("큰수 :"+num);
//			System.out.println("작은수 :"+num2);
//		}else if(num<num2) {
//			System.out.println("큰수 :"+num2);
//			System.out.println("작은수 :"+num);
//		}
		
		
		/* 문제8-정수실수 */
		
//		System.out.println("수를 입력하세요");
//		double num = in.nextDouble();
//		
//		if (num%1==0) {
//			System.out.println("정수입니다");
//		}else {
//			System.out.println("실수입니다");
//		}
		
		
		/* 문제9-2자리수3자리수 */
		
		System.out.println("수를 입력하세요");
		int num = in.nextInt();
		int h = num/100;
		int t = (num%100)/10;
		int o = num%10;
		
		if(num>= 100 && num <= 999) {
			System.out.println(o+""+t+""+h);
		}else if(num >= 10 && num<=100) {
			System.out.println("합 : "+(t+o));
		}
		
		

	}

}

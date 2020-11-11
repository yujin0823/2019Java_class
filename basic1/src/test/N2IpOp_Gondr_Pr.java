package test;

import java.util.Scanner;

public class N2IpOp_Gondr_Pr {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/*예제*/
		
//		System.out.println("숫자를 입력하세요");
//		int num = in.nextInt();
//		
//		System.out.println("당신이 입력한 수는"+num);
		
		
		/*문제1-이름*/
		
//		System.out.println("이름을 입력하세요");
//		String name = in.next();
//		
//		System.out.println("당신의 이름은"+name);
		
		
		/*문제2-정수의 합*/
		
//		System.out.println("첫번째수를 입력하세요");
//		int num = in.nextInt();
//		System.out.println("두번째수를 입력하세요");
//		int num2 = in.nextInt();
//		
//		int sum = num+num2;
//		
//		System.out.println("두수의 합은:"+sum);
		
		
		/*문제3-실수의 합*/
		
//		System.out.println("첫번째 실수를 입력하세요");
//		double num = in.nextDouble();
//		System.out.println("두번째 실수를 입력하세요");
//		double num2 = in.nextDouble();
//		
//		double sum = num+num2;
//		
//		System.out.println("두 실수의 합은"+sum);
		
		
		/*문제4-삼각형 넓이*/
		
		System.out.println("높이를 입력하세요");
		int h = in.nextInt();
		System.out.println("밑변을 입력하세요");
		int w = in.nextInt();
		
		int s = h*w/2;
		
		System.out.println("삼각형의 넓이는"+s);
		
	}

}

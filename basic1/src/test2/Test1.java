package test2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/*문제1-이름학번출력*/
		
//		System.out.println("학번 : 10106");
//		System.out.println("이름 : 이유진");
		
		
		/*문제2-연필*/
		
//		System.out.println("연필을 입력하세요");
//		int pen = in.nextInt();
//		System.out.println("학생수를 입력하세요");
//		int st = in.nextInt();
//		
//		int share = pen/st;
//		int mod = pen%st;
//		
//		System.out.println(st+"명의 학생에게 연필을  "+share+"개씩 나눠주고 "+mod+" 개 만큼 남습니다.");
		
		
		/*문제3-5개 입력후 짝수만 더해라*/
		
//		int sum = 0;
//		
//		for (int i=0; i<5; i++) {
//			int num = in.nextInt();
//			
//			if (num%2==0) {
//				sum = sum + num;
//			}
//		}
//		System.out.println(sum);
		
		
		/*문제4-시간*/
		
//		int time = in.nextInt();
//		
//		int h = time/3600;
//		int t = (time%3600)/60;
//		int o = time%60;
//
//		System.out.println(h+"시 "+t+"분 "+o);
		
		
		/*문제5-0입력시 종료 평균과 합계*/
		
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
//			avg = sum / count;
//		}
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+avg);
		
		
		/*문제6-윤년*/
		
//		System.out.println("년,월 입력 ex)2019 3");
//		int year = in.nextInt();
//		int month = in.nextInt();
//		
//		if ((month <= 7 && month%2==1) || (month<=8 && month%2==0)) {
//			System.out.println("31");
//		}else if (month==2) {
//			if ((year%4==0 && year%100!=0) || year%400==0) {
//				System.out.println("29");
//			}else {
//				System.out.println("28");
//			}
//		}else {
//			System.out.println("30");
//		}
		
		
		/*문제7-선한티쳐의 이상한 수학시간*/
		
//		long sum = 0;
//		int num = in.nextInt();
//		
//		for (int i=1; i<=num; i++) {
//			sum = sum + pr(i);
//		}
//		System.out.println(sum);
		
		
		/*문제8-구구단*/
		
//		int dan = in.nextInt();
//		
//		for (int i=1 ;i<=9; i++) {
//			System.out.println(dan+" X "+ i +" = "+(dan*i));
//		}
		
		
		/*문제9-피라미드*/
		
		int floor = in.nextInt();
		
		for (int i=1; i<=floor; i++) {
			for (int j = 1; j <= floor - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		/*문제10-최댓값*/
		
//		int max = 0;
//		
//		while (true) {
//			int num = in.nextInt();
//			
//			if (num>max) {
//				max = num;
//			}
//			
//			if (num<0) {
//				break;
//			}
//		}
//		System.out.println(max);
		
		
	}
	
	public static long pr(long n) {
		long result = 1;
		
		for (int i=1; i<=n; i++) {
			result = result * i;
		}
		
		return result;
	}
	


}

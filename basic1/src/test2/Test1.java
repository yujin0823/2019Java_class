package test2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/*����1-�̸��й����*/
		
//		System.out.println("�й� : 10106");
//		System.out.println("�̸� : ������");
		
		
		/*����2-����*/
		
//		System.out.println("������ �Է��ϼ���");
//		int pen = in.nextInt();
//		System.out.println("�л����� �Է��ϼ���");
//		int st = in.nextInt();
//		
//		int share = pen/st;
//		int mod = pen%st;
//		
//		System.out.println(st+"���� �л����� ������  "+share+"���� �����ְ� "+mod+" �� ��ŭ �����ϴ�.");
		
		
		/*����3-5�� �Է��� ¦���� ���ض�*/
		
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
		
		
		/*����4-�ð�*/
		
//		int time = in.nextInt();
//		
//		int h = time/3600;
//		int t = (time%3600)/60;
//		int o = time%60;
//
//		System.out.println(h+"�� "+t+"�� "+o);
		
		
		/*����5-0�Է½� ���� ��հ� �հ�*/
		
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
//		System.out.println("�հ� : "+sum);
//		System.out.println("��� : "+avg);
		
		
		/*����6-����*/
		
//		System.out.println("��,�� �Է� ex)2019 3");
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
		
		
		/*����7-����Ƽ���� �̻��� ���нð�*/
		
//		long sum = 0;
//		int num = in.nextInt();
//		
//		for (int i=1; i<=num; i++) {
//			sum = sum + pr(i);
//		}
//		System.out.println(sum);
		
		
		/*����8-������*/
		
//		int dan = in.nextInt();
//		
//		for (int i=1 ;i<=9; i++) {
//			System.out.println(dan+" X "+ i +" = "+(dan*i));
//		}
		
		
		/*����9-�Ƕ�̵�*/
		
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

		
		
		/*����10-�ִ�*/
		
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

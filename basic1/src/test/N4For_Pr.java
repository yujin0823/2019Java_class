package test;

import java.util.Scanner;

public class N4For_Pr {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/*����1-1~100���� 2�� ����̸鼭 3�ǹ���� �ƴѰ�*/
		
//		for (int i=1; i<=100; i++) {
//			if (i%3!=0 && i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		
		/*����2-1~100���� 2�ǹ�� ���ϰ� 3�ǹ�� ����*/
		
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
		
		
		/*����3-�Է��Ѱ������� ��*/
		
//		int num = in.nextInt();
//		int sum = 0;
//		
//		for (int i=1; i<=num; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
		
		/*����4-0�Է��ϸ�����-->�հ����*/
		
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
//		System.out.println("�հ� : "+sum);
//		System.out.println("��� : "+avg);
		
		
		/*����5-Ű���� 5���ް� ����� ���ϱ�*/
		
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
		
		
		/*����6-�Ҽ�*/
		
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
		
		
		/*����7-*****�μ���*/
		
//		int num = in.nextInt();
//		
//		for (int i=0; i<num ;i++) {
//			System.out.println("*****");
//		}
		
		
		/*����8-*�ø���*/
		
		int num = in.nextInt();
		
		for (int i=0; i<num; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}

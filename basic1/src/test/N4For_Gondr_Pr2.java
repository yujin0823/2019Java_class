package test;

import java.util.Scanner;

public class N4For_Gondr_Pr2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/*����1-6������*/
		
//		int sum = 0;
//		for(int i=1; i<=6 ; i++) {
//			sum = sum+i;
//			System.out.println(sum);
//		}
//		System.out.println("�� : "+sum);
		
		
		/*����2-3�ǹ��*/
		
//		System.out.println("���� �Է��ϼ���");
//		int num = in.nextInt();
//		
//		for (int i=1 ; i<=num ; i++) {
//			if(i%3==0) {
//				System.out.println(i);
//			}
//		}
		
		
		/*����3-100����������*/
		
//		int sum = 0;
//		
//		while(true) {
//			int num = in.nextInt();
//			sum = sum+num;
//			
//			if(sum>=100) {
//				break;
//			}
//			System.out.println("�� : "+sum);
//		}
//		System.out.println("�� : "+sum);
		
		
		/*����4-�������������� �հ����*/
		
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
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);
		
		
	}

}

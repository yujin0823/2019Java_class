package test;

import java.util.Scanner;

public class N3If_pr {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/* ����1-¦��Ȧ�� */

//		System.out.println("���� �Է��ϼ���");
//		int num = in.nextInt();
//		
//		if(num%2==0) {
//			System.out.println("¦��");
//		}else {
//			System.out.println("Ȧ��");
//		}
		

		/* ����2-�̸����� */

//		System.out.println("�̸��� �Է��ϼ���");
//		String name = in.next();
//
//		if (name.length() >= 5) {
//			System.out.println("�ʹ�����");
//		} else {
//			System.out.println(name + "�ȳ��ϼ���");
//		}
		

		/* ����3-�ð� */
		
//		System.out.println("�ð��� �Է��ϼ���");
//		int time = in.nextInt();
//		int h = time/3600;
//		int m = (time%3600)/60;
//		int s = time%60;
//		
//		System.out.println(h+"��"+m+"��"+s+'��');
		
		
		/* ����4-��� */
		
//		System.out.println("����� �Է��ϼ���");
//		int num = in.nextInt();
//		
//		if(num==1) {
//			System.out.println("�������߾��");
//		}else if(num<=3) {
//			System.out.println("���߳׿�");
//		}else if(num<=6) {
//			System.out.println("�����̳׿�");
//		}else if(num<=19) {
//			System.out.println("����� �ʿ��ϳ׿�");
//		}
		
		
		/* ����5-ū�������� */
		
//		System.out.println("���� �Է��ϼ���");
//		int num = in.nextInt();
//		int num2 = in.nextInt();
//		
//		if(num>num2) {
//			System.out.println("ū�� :"+num);
//			System.out.println("������ :"+num2);
//		}else if(num<num2) {
//			System.out.println("ū�� :"+num2);
//			System.out.println("������ :"+num);
//		}
		
		
		/* ����8-�����Ǽ� */
		
//		System.out.println("���� �Է��ϼ���");
//		double num = in.nextDouble();
//		
//		if (num%1==0) {
//			System.out.println("�����Դϴ�");
//		}else {
//			System.out.println("�Ǽ��Դϴ�");
//		}
		
		
		/* ����9-2�ڸ���3�ڸ��� */
		
		System.out.println("���� �Է��ϼ���");
		int num = in.nextInt();
		int h = num/100;
		int t = (num%100)/10;
		int o = num%10;
		
		if(num>= 100 && num <= 999) {
			System.out.println(o+""+t+""+h);
		}else if(num >= 10 && num<=100) {
			System.out.println("�� : "+(t+o));
		}
		
		

	}

}

package test;

import java.util.Scanner;

public class N3If_Gondr_Pr {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/*����1-2��3�� ���*/
		
//		System.out.println("���� �Է��ϼ���");
//		int num = in.nextInt();
//		
//		if(num%2==0) {
//			System.out.println("2�� ����Դϴ�");
//		}else if(num%3==0) {
//			System.out.println("3�� ����Դϴ�");
//		}else {
//			System.out.println("�ƹ��͵� �ƴմϴ�");
//		}
		
		
		/*����2-�̸��� ����*/
		
//		System.out.println("�̸��� �Է��ϼ���");
//		String name = in.next();
//		
//		if(name.length()>=10) {
//			System.out.println("�ʹ�����");
//		}else {
//			System.out.println("�������"+name+"��");
//		}
		
		
		/*����3-ȭ���µ�*/
		
//		System.out.println("ȭ���µ��� �Է��ϼ���");
//		double F = in.nextDouble();
//		double C = (5/9.0)*(F-32);
//		
//		System.out.println("�����µ� :"+C);
//		
//		if (C>=30) {
//			System.out.println("������");
//		}else if(C<=10) {
//			System.out.println("�߿���");
//		}
		
		
		/*����4-3�ڸ��� ������ ��*/
		
//		System.out.println("���� �Է��ϼ���");
//		int num = in.nextInt();
//		int h = num/100;
//		int t = (num%100)/10;
//		int o = num%10;
//		
//		System.out.println("�� :"+(h+t+o));
		
		
		/*����5-���ʰ� �л�*/
		
//		System.out.println("�л����� ������");
//		int st = in.nextInt();
//		System.out.println("���ʼ��� ������");
//		int pen = in.nextInt();
//		
//		int sh = pen/st;
//		int n = pen%st;
//		
//		System.out.println("�������ִ� ���� :"+sh);
//		System.out.println("���� ���� :"+n);
		
		
		/*����6-�� ȯ��*/
		
		System.out.println("�ð��� �Է��ϼ���");
		int time = in.nextInt();
		int h = time/3600;
		int m = (time%3600)/60;
		int s = time%60;
		
		System.out.println(h+"��"+m+"��"+s+"��");

	}

}

package n1main;

import java.util.Scanner;

public class N5Test {

	public static void main(String[] args) {
		//System.out.println("����� �Է��ϼ���");
		Scanner in = new Scanner(System.in);
		
		/*���� 3�ڸ� 2�ڸ�*/
		
//		System.out.println("���� �Է��ϼ���");
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
		
		
		/*���� �Ǽ�*/
		
//		System.out.println("���� �Է��ϼ���");
//		
//		double num =  in.nextDouble();
//		if (num % 1 == 0) {
//			System.out.println("�����Դϴ�");
//		}else {
//			System.out.println("�Ǽ��Դϴ�");
//		}
		
		
		/*�μ� ��*/
		
//		System.out.println("ù��° ���� �Է��ϼ���");
//		int number1 = in.nextInt();
//		System.out.println("�ι�° ���� �Է��ϼ���");
//		int number2 = in.nextInt();
//		
//		if(number1 > number2) {
//			System.out.println("ū��:"+ number1 + "," +"������ :" + number2);
//		}else {
//			System.out.println("ū��:"+ number2 + "," +"������ :" + number1);
//		}
		
		
		/*���*/
		
//		int sc = in.nextInt();
//		if (sc<1 && sc<20) {
//			System.out.println("�߸��Է��߽��ϴ�");
//		} else {
//			if (sc == 1) {
//				System.out.println("���� ���߾��");
//			} else if (sc <= 3) {
//				System.out.println("���߳׿�");
//			} else if (sc <= 6) {
//				System.out.println("�����Դϴ�");
//			} else if (sc <= 19) {
//				System.out.println("����� �ʿ��մϴ�");
//			}
//		}

		/* �� */

//		System.out.println("�ʸ� �Է��ϼ���");
//		int time = in.nextInt();
//		int h = time/3600;
//		int m = (time%3600)/60;
//		int s = time%60;
//		
//		System.out.println(h + "�ð�" + m + "��" + s + "��");

		
		/* �̸� */

//		System.out.println("�̸��� �Է��ϼ���");
//		String name = in.nextLine();
//		
//		if (name.length() >= 5) {
//			System.out.println("�ʹ� ��ϴ�");
//		}else {
//			System.out.println(name + "�ȳ��ϼ���");
//		}

		
		/* ���� */

		System.out.println("������ �Է��ϼ���");
		double number = in.nextDouble();
		
		if(number %2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}

	}

}

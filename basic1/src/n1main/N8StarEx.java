package n1main;

import java.util.Scanner;

public class N8StarEx {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/*����7*/
		
		System.out.println("���ڸ� �Է��ϼ���");
		int num3 = in.nextInt();
		
		for(int i=0; i< num3; i++) {
			System.out.println("*****");
		}
		
		/*����8*/
		
		System.out.println("������ �Է��ϼ���");
		int num = in.nextInt();
		
		for (int i=0; i < num; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		/*�ݴ��*/
		
		System.out.println("������ �Է��ϼ���");
		int num2 = in.nextInt();

		for (int i = 0; i < num2; i++) {

			for (int j = 0; j < num2 - i - 1; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}

package test2;

import java.util.Scanner;

public class N5SumAver {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/* ����5-0�� �ԷµǸ� ���� -->�հ���ձ��ϱ� */
		
		System.out.println("������ �Է��ϼ���");
		
		double sum = 0;
		double avg = 0;
		int count = 0;
		
		while (true) {
			int num = in.nextInt();
			
			if (num==0) {
				break;
			}
			count ++;
			sum = sum + num;
			avg = sum / count;
		}
		System.out.println("�հ� : "+sum+", ��� : "+avg);
		
		
	}

}

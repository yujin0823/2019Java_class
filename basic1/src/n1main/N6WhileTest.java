package n1main;

import java.util.Scanner;

public class N6WhileTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("���ڸ� �Է��ϼ���");
		while(sum <=1000) {
			int value = in.nextInt();
			
			if(value<0) {
				break;
			}
			sum = sum + value;
//			System.out.println("������� ��:"+ sum);
			
			//���� 1000�Ѿ�� ����
//			if (sum>1000) {
//				break;
//			}
		}
		System.out.println("������� ��:"+ sum);
		System.out.println("���");

	}

}

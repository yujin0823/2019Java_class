package n1main;

import java.util.Random;
import java.util.Scanner;

public class N6ForTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random gondr = new Random();

		System.out.println("Ȯ���� �Է��ϼ���");
		double percent = in.nextDouble();
		System.out.println("����Ƚ���� �Է��ϼ���");
		int count = in.nextInt();
		int success = 0;
		int fail = 0;

		for (int i = 0; i < count; i++) {
			double number = gondr.nextDouble() * 100;

			if (number < percent) {
				// success����
				success++;
				
				// System.out.println(number + ": ����");
			} else {
				// fail����
				fail++;
				
				// System.out.println(number + ": ����");
			}
			
			if(fail>=20) {
				break;
			}
		}
		System.out.println("��ü" + (success+fail) + "ȸ��" + success + "����" + fail + "����");

		/* �Է��� �������� 1������ �� ���ϱ� */

//		long num = in.nextLong();		
//		
//		for(int i=1; i<=num; i++) { //i++ == i=i+1
//			if(i%3 ==0) {
//				System.out.println(i);
//			}
//		}

	}

}

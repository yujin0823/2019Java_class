package n1main;

import java.util.Scanner;

public class N7ExEarn {

	public static void main(String[] args) {
		//����ڷ� ���� ��� �Է��� �޾ƾ��� �Էµ� ���� �� 100������ ����	
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		while(sum<=100) {
			System.out.println("����ġ�� �Է��ϼ���");
			int num = in.nextInt();
			sum = sum+num;
			System.out.println("���� ��:"+sum);
		}
		
		System.out.println("������ :"+sum);
	}

}

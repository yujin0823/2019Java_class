package n2massard;

import java.util.Scanner;

public class N11_Test7_Prime {

	public static void main(String[] args) {
Scanner in = new Scanner (System.in);
		
		System.out.println("���� �Է��ϼ���");
		int num = in.nextInt();
		boolean prime = true;
		
		for(int i=2; i<num; i++) {
			prime = true;
			if(num%i==0) {
				prime = false;
				System.out.println("�Ҽ��� �ƴմϴ�");
				break;
			}
		}
		if(prime == true) {
			System.out.println("�Ҽ��Դϴ�");
		}

	}

}

package n2massard;

import java.util.Scanner;

public class N11_Test7_Prime {

	public static void main(String[] args) {
Scanner in = new Scanner (System.in);
		
		System.out.println("수를 입력하세요");
		int num = in.nextInt();
		boolean prime = true;
		
		for(int i=2; i<num; i++) {
			prime = true;
			if(num%i==0) {
				prime = false;
				System.out.println("소수가 아닙니다");
				break;
			}
		}
		if(prime == true) {
			System.out.println("소수입니다");
		}

	}

}

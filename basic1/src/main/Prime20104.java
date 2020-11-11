package main;

import java.util.Scanner;

//숫자 앞으로하면 오류나서 뒤에 했습니다.
public class Prime20104 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("첫번째 수를 입력하시오");
		int num1 = in.nextInt();
		int num2 = 0;
		int sum = 0;
		
		while (true) {
			System.out.println("두번째 수를 입력하시오");
			num2 = in.nextInt();
			if (num2 >= num1) {
				break;
			}
			System.out.println("첫번째 입력한 수보다 큰수를 입력해주세요");
		}
		
		int min = num2;
		for (int i = num1; i <= num2; i++) {
			boolean prime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}

			if (prime == true) {
//				System.out.print(i + " ");
				if (i != 1) {
					sum += i;
					if (min > i) {
						min = i;
					}
				}
			}
		}
		
		if (sum == 0) {
			System.out.println("이유진");
		}else {
			System.out.println("소수의 합은 " + sum + "입니다.");
			System.out.println("가장 작은 소수는 " + min + "입니다");
		}
	}

}

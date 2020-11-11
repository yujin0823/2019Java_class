package main;

import java.util.Scanner;

public class Myfibo20104 {

	public static int cnt0 = 0;
	public static int cnt1 = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("입력자료의 개수를 입력해주세요.");
		int N = in.nextInt();
		
		int num[] = new int [N];
		
		System.out.println(N + "개의 자료를 입력해주세요.");
		for (int i = 0; i < num.length; i++) {
			num[i] = in.nextInt();
			int temp = num[i];
			myfibonacci(temp);

			System.out.println(cnt0 + ", " + cnt1);
			
			cnt0 = 0;
			cnt1 = 0;
		}
	}

	static int myfibonacci(int n) {
		if (n == 0) {
//			System.out.print("0");
			cnt0++;
			return 0;
		} else if (n == 1) {
//			System.out.print("1");
			cnt1++;
			return 1;
		} else {
			return myfibonacci(n - 1) + myfibonacci(n - 2);
		}
	}
}

package test2;

import java.util.Scanner;

public class N7Sequence {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n = in.nextInt();
		long sum = 0;
		
		for (int i = 1 ; i<=n; i++) {
			sum = sum + prod(i);
		}
		System.out.println(sum);

	}
	
	public static long prod(long n) {
		long result = 1;
		
		for (int i = 1; i<=n; i++) {
			result = result * i;
		}
		
		return result;
	}

}

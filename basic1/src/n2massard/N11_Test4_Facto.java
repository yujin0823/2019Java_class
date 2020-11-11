package n2massard;

import java.util.Scanner;

public class N11_Test4_Facto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("값을 입력하세요");
		int n = in.nextInt();
		factorial(n);

	}
	
	public static int factorial(int n) {
		int factoSum = 1;
		
		for(int i=1; i<=n; i++) {
			factoSum = factoSum*i;
		}
		System.out.println(factoSum);
		
		return factoSum;
	}

}

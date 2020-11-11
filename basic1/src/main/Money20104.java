package main;

import java.util.Arrays;
import java.util.Scanner;

public class Money20104 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("학생의 수를 입력하세요.");
		int S = in.nextInt();
		
		// 시간을 넣을 배열
		int[] T = new int[S];
		
		System.out.println("돈을 인출하는 시간을 입력해주세요.");
		for (int i = 0; i < T.length; i++) {
			T[i] = in.nextInt();
		}
		
		// 시간 배열의 값 작은 순으로 정렬
		Arrays.sort(T);
		
//		for (int i = 0; i < times.length; i++) {
//			System.out.println(times[i]);
//		}
		
		int TSum = T[0];
		for (int i = 1; i < T.length; i++) {
			T[i] += T[i - 1];
			TSum += T[i];
		}
		
		System.out.println("합의 최솟값은 " + TSum + "분 입니다.");
	}
}

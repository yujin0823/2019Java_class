package n3array;

import java.util.Scanner;

public class N15HeightClass {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] heights = new int[3][2];
		
		for(int i = 0; i < heights.length; i++) {
			System.out.println( (i + 1) + "반의 키를 입력합니다.");
			for(int j = 0; j < heights[i].length; j++) {
				System.out.println( (j + 1) + "번의 키를 입력하세요");
				heights[i][j] = in.nextInt();
			}
		}
		
		System.out.println("입력된 키");
		double totalSum = 0;
		for(int i = 0; i < 3; i++) {
			System.out.print( (i + 1) + "반 키 : ");
			double subSum = 0;
			for(int j = 0; j < 2; j++) {
				subSum += heights[i][j];
				System.out.printf("%5d", heights[i][j]);
			}
			System.out.printf("평균 :%5.2f\n", subSum / 2);
			totalSum += subSum;
			
		}
		System.out.printf("전체 평균 %5.2f", totalSum /6);
		
		//d는 실수 n은 정수
	}
}

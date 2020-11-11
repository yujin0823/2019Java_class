package n3array;

import java.util.Scanner;

public class GondrHeightClass {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int [][] heights = new int [3][2];
		int sum = 0;
		int avg = 0;
		
		for (int i=0; i<3; i++) {
			System.out.println((i+1)+"반의 키를 입력합니다");
			for (int j=0; j<2; j++) {
				System.out.println((j+1)+"번의 키를 입력합니다");
				heights[i][j] = in.nextInt();
			}
		}
		
		System.out.println("입력된 키");
		for (int i=0; i<3; i++) {
			System.out.println((i+1)+"반 키 : ");
			for (int j=0; j<2; j++) {
				sum = sum + heights[i][j];
				avg = sum / 6;
				System.out.print(heights[i][j]+",");
			}
		}
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
	}

}

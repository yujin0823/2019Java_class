package n3array;

import java.util.Scanner;

public class GondrHeightClass {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int [][] heights = new int [3][2];
		int sum = 0;
		int avg = 0;
		
		for (int i=0; i<3; i++) {
			System.out.println((i+1)+"���� Ű�� �Է��մϴ�");
			for (int j=0; j<2; j++) {
				System.out.println((j+1)+"���� Ű�� �Է��մϴ�");
				heights[i][j] = in.nextInt();
			}
		}
		
		System.out.println("�Էµ� Ű");
		for (int i=0; i<3; i++) {
			System.out.println((i+1)+"�� Ű : ");
			for (int j=0; j<2; j++) {
				sum = sum + heights[i][j];
				avg = sum / 6;
				System.out.print(heights[i][j]+",");
			}
		}
		
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);
		
	}

}

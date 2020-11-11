package n3array;

import java.util.Scanner;

public class N15HeightClass {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] heights = new int[3][2];
		
		for(int i = 0; i < heights.length; i++) {
			System.out.println( (i + 1) + "���� Ű�� �Է��մϴ�.");
			for(int j = 0; j < heights[i].length; j++) {
				System.out.println( (j + 1) + "���� Ű�� �Է��ϼ���");
				heights[i][j] = in.nextInt();
			}
		}
		
		System.out.println("�Էµ� Ű");
		double totalSum = 0;
		for(int i = 0; i < 3; i++) {
			System.out.print( (i + 1) + "�� Ű : ");
			double subSum = 0;
			for(int j = 0; j < 2; j++) {
				subSum += heights[i][j];
				System.out.printf("%5d", heights[i][j]);
			}
			System.out.printf("��� :%5.2f\n", subSum / 2);
			totalSum += subSum;
			
		}
		System.out.printf("��ü ��� %5.2f", totalSum /6);
		
		//d�� �Ǽ� n�� ����
	}
}

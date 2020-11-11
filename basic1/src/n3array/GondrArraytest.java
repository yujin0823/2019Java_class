package n3array;

import java.util.Scanner;

public class GondrArraytest {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String [] name = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};;
		double [] score = new double [10];
		
		double sum = 0;
		double avg = 0;
		double max = 0;
		
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]+"의 점수를 입력하세요");
			score[i] = in.nextDouble();
		}
		
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]+" : "+score[i]);
		}
		
		for (int i=0; i<name.length; i++) {
			sum = sum + score[i];
			avg = sum / name.length;
			if (max < score[i]) {
				max = score[i];
			}
		}
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최고 : "+max);
		
	}
}
package n3array;

import java.util.Scanner;

public class N13ArrayTest2 {

	public static void main(String[] args) {
		
		String[] names = {"최선한","홍길동","물민"};
		
		int [] scores = new int[names.length];
		
		Scanner in = new Scanner (System.in);
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]+"님의 성적은?");
			scores[i] = in.nextInt();
		}
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i] + ":" +scores[i]);
		}
		
		int max = 0; 
		int sum = 0;
		int avg = 0;
		
		
		for (int i=0; i<names.length; i++) {
			if (scores[max] < scores[i]) {
				max = i;
			}
			sum = sum + scores[i];
			avg = sum / names.length;
		}
		System.out.println("최고점 : "+names[max] + " 님("+scores[max]+"점)");
		System.out.println("점수합계 : "+sum+"점");
		System.out.println("점수평균 : "+avg);

	}
	
//	public static void printArray(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println("");
//	}

}


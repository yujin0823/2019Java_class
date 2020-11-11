package n3array;

import java.util.Scanner;

public class N13ArrayTest21 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String [] names = {"솔라", "문별", "휘인", "화사"};
		int [] scores = new int [names.length];
		
		int sum = 0;
		int avg = 0;
		int max = 0;
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]+"의 점수를 입력하세요");
			scores[i] = in.nextInt();
		}
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]+" : "+scores[i]);
		}
		
		for (int i=0; i<names.length; i++) {
			sum = sum + scores[i];
			avg = sum / names.length;
			if (scores[max] < scores[i]) {
				max = i;
			}
		}
		
		System.out.println("최고점 : "+names[max] + " 님("+scores[max]+"점)");
		System.out.println("점수합계 : "+sum+"점");
		System.out.println("점수평균 : "+avg);
		
	}

}

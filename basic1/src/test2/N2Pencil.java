package test2;

import java.util.Scanner;

public class N2Pencil {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/* 문제2-연필나누기 */
		
		System.out.println("연필의 개수는?");
		int pen = in.nextInt();
		System.out.println("학생의 수는?");
		int st = in.nextInt();
		
		int share = pen/st;
		int nam = pen%st;
		
		System.out.println(st+"명의 학생에게 연필 "+share+"개씩 나눠주고 "+nam+"개 만큼 남습니다");

	}

}

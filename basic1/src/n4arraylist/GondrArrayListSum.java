package n4arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class GondrArrayListSum {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int sum = 0;
		int avg = 0;
		int max = 0;
		
		System.out.println("�Է��ϼ���");
		while (true) {
			int n = in.nextInt();
			
			if (n==0) {
				break;
			}
			
			list.add(n);
		}
		
		for (int i=0; i<list.size(); i++) {
			sum = sum + list.get(i);
			avg = sum/list.size();
			
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		
		System.out.println("�� : "+sum);
		System.out.println("��� : "+avg);
		System.out.println("�ְ� : "+max);

	}

}

package n3array;

import java.util.Scanner;

public class N13ArrayTest21 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String [] names = {"�ֶ�", "����", "����", "ȭ��"};
		int [] scores = new int [names.length];
		
		int sum = 0;
		int avg = 0;
		int max = 0;
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]+"�� ������ �Է��ϼ���");
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
		
		System.out.println("�ְ��� : "+names[max] + " ��("+scores[max]+"��)");
		System.out.println("�����հ� : "+sum+"��");
		System.out.println("������� : "+avg);
		
	}

}

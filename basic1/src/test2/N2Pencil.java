package test2;

import java.util.Scanner;

public class N2Pencil {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/* ����2-���ʳ����� */
		
		System.out.println("������ ������?");
		int pen = in.nextInt();
		System.out.println("�л��� ����?");
		int st = in.nextInt();
		
		int share = pen/st;
		int nam = pen%st;
		
		System.out.println(st+"���� �л����� ���� "+share+"���� �����ְ� "+nam+"�� ��ŭ �����ϴ�");

	}

}

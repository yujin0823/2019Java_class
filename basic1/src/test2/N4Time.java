package test2;

import java.util.Scanner;

public class N4Time {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/* ����4-�ʴ��� �����Է��� �ð����(����-�ʴ�21���� �ѱ����ʴ´�) */
		
		System.out.println("������ �Է��ϼ���");
		
		int time = in.nextInt();
		int h = time/3600;
		int m = (time%3600)/60;
		int s = time%60;
		
		System.out.println(h+"��"+m+"��"+s);
	}

}

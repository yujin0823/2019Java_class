package n3array;

import java.util.Scanner;

public class N14Input10 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner in = new Scanner(System.in);
		
		System.out.println("10���� ������ �Է��ϼ���");
		for (int i=0; i<10; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println("���ϴ� �ε����� ���� �Է��ϼ���");
		int idx = in.nextInt();
		
		int cnt = 0;
		
		for (int i=0; i<arr.length; i++)  {
			if (arr[idx] <= arr[i]) {
				cnt++;
			}
		}
		
		System.out.println(arr[idx] + "��"+ cnt +"��°�� Ů�ϴ�.");
	}

}

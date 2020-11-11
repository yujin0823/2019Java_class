package n3array;

import java.util.Scanner;

public class N14Input10 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner in = new Scanner(System.in);
		
		System.out.println("10개의 정수를 입력하세요");
		for (int i=0; i<10; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println("원하는 인덱스의 값을 입력하세요");
		int idx = in.nextInt();
		
		int cnt = 0;
		
		for (int i=0; i<arr.length; i++)  {
			if (arr[idx] <= arr[i]) {
				cnt++;
			}
		}
		
		System.out.println(arr[idx] + "는"+ cnt +"번째로 큽니다.");
	}

}

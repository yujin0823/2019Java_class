package n3array;

import java.util.Arrays;

public class N13ArrayTest {

	public static void main(String[] args) {

		int[] arr1 = new int[10];
		int[] arr2 = new int[10];

//		//�ʱ�ȭ 1�� ���
//		for (int i=0; i<10 ; i++) {
//			arr[i] = 2;
//		}
//		
//		//�ʱ�ȭ 2�� ���
//		Arrays.fill(arr, 9);

		arr1[0] = 20;
		arr2[0] = 30;

		/*�޼ҵ� ���� �� �ʿ�x*/
		
//		for (int i = 0; i < 10; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.println("");
//
//		for (int i = 0; i < 10; i++) {
//			System.out.print(arr2[i] + " ");
//		}
//		System.out.println("");
		
		
		printArray(arr1);
		printArray(arr2);
		arr1=arr2;
		printArray(arr1);
		printArray(arr2);
		arr1 [0]=80;
		printArray(arr1);
		printArray(arr2);
		
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}

}

package n3array;

import java.util.Scanner;

public class N14Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/* ���� */
		
//		String [] name = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};;
//		double [] score = new double [10];
//		
//		for (int i=0; i<name.length; i++) {
//			System.out.println(name[i]+"�� ������ �Է��ϼ���");
//			score[i] = in.nextDouble();
//		}
//		
//		double sum = 0;
//		double avg = 0;
//		double max = 0;
//		
//		for (int i=0; i<name.length; i++) {
//			sum = sum + score[i];
//			if (max < score[i]) {
//				max = score[i];
//			}
//			avg = sum / name.length;
//		}
//		
//		System.out.println("���� : "+sum);
//		System.out.println("��� : "+avg);
//		System.out.println("�ְ� : "+max);
		
		
		/* 1�� �Ųٷ� ��� */
		
//		System.out.println("n�� �Է��ϼ���");
//		int n = in.nextInt();
//		int [] arr = new int [n];
//		
//		System.out.println("n�� �Է��ϼ���");
//		for (int i=0; i<arr.length; i++) {
//			arr[i] = in.nextInt();
//		}
//		
//		for (int i=arr.length-1; i>=0; i--) {
//			System.out.print(arr[i]+" ");
//		}
		
		
		/* 2�� �����̼� */
		
//		System.out.println("n�� �Է��ϼ���");
//		int n = in.nextInt();
//		int [] arr = new int [n];
//		
//		System.out.println("n�� �Է��ϼ���");
//		for (int i=0; i<arr.length; i++) {
//			arr[i] = in.nextInt();
//		}
//		
//		for (int i=0; i<arr.length; i++) {
//			for (int j=i; j<i+n; j++) {
//				System.out.print(arr[j%n]+" ");
//			}
//			System.out.println();
//		}
		
		
		/* 3�� ��ȣ���� */
		
//		int open = 0;
//		int close = 0;
//		
//		System.out.println("���ڿ��Է�");
//		String str = in.nextLine();
//		
//		for (int i=0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			
//			if (c=='(') {
//				open++;
//			}else {
//				close++;
//			}
//		}
//		System.out.println(open+","+close);

		
		/*4�� ���ĺ�*/
		
//		char [] alphas = new char [26];
//		int [] cnt = new int [26];
//		
//		System.out.println("���ڿ��Է�");
//		String str = in.nextLine();
//		
//		for (int i=0; i<alphas.length; i++) {
//			alphas[i] = (char)('a'+i);
//		} 
//		
//		for (int i=0; i<str.length(); i++) {
//			char c = str.charAt(i);
//			
//			for (int j=0; j<alphas.length; j++) {
//				if (c==alphas[j]) {
//					cnt[j]++;
//				}
//			}
//		}
//		
//		for (int i=0; i<alphas.length; i++) {
//			if (cnt[i]>0) {
//				System.out.println(alphas[i]+" : "+cnt[i]);
//			}
//		}
		
		
		/* 5�� �ߺ����� �ٽ��Է� 10���� */

//		int[] numbers = new int[10];
//		
//		for(int i =0; i < numbers.length; i++) {
//			
//			while(true) {
//				numbers[i]  = in.nextInt();//numbers �迭�� i��°�� �� �Է¹ޱ�
//				boolean find = false;
//				for(int j = 0; j < i; j++) {
//					if( numbers[j] == numbers[i] ) { //numbers�迭�� j��°�� i��°�� ������
//						find = true;
//					}
//				}
//				
//				if(!find) {
//					break;
//				}else {
//					System.out.println("�ߺ��Դϴ�. �ٽ��Է��ϼ���");
//				}
//			}//while����
//		}//for����
//		
//		System.out.println("�Էµ� ���� ������ �����ϴ�.");
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}

		
		/* 6�� 2�����迭 ���������� */
		
//		int n = in.nextInt();
//		int [][] arr = new int [n][n];
//		int num = 1;
//		
//		for (int i=0; i<arr.length; i++) {
//			for (int j=0; j<arr[0].length; j++) {
//				arr[i][j] = num;
//				System.out.printf("%3d",arr[i][j]);
//				num++;
//			}
//			System.out.println();
//		}

		
		
		/* 7�� �Ʒ��� */
		
		int n = in.nextInt();
		int [][] arr = new int [n][n];

		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[0].length; j++) {
				arr[i][j] = (i+1)+(j*n);
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[0].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		/* 9�� ������ */

//		System.out.println("���� n�� �Է��ϼ���");
//		int n = in.nextInt();
//		int [][] map = new int [n][n];
//		
//		int first = 0;
//		int last = n-1;
//		int value = 1;
//		
//		for (int i=0; i<n; i++) {
//			if (i%2==0) { //��
//				for (int j=first;j<=last; j++) {
//					map[first][j] = value;
//					value++;
//				}first++;
//			}else { //�Ʒ�
//				for (int j=last; j>=first-1; j--) {
//					map[last+1][j] = value;
//					value++;
//				}
//			}
//			
//			if (i%2==0) {
//				for (int j=first; j<=last; j++) {
//					map[j][last] = value;
//					value++;
//				}last--;
//			}else {
//				for (int j=last; j>=first; j--) {
//					map[j][first-1] = value;
//					value++;
//				}
//			}
//		}
//		
//		for (int i=0; i<n; i++) {
//			for (int j=0; j<n; j++) {
//				System.out.printf("%4d",map[i][j]);
//			}
//			System.out.println();
//		}

	}
}
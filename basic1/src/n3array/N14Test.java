package n3array;

import java.util.Scanner;

public class N14Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/* 예제 */
		
//		String [] name = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};;
//		double [] score = new double [10];
//		
//		for (int i=0; i<name.length; i++) {
//			System.out.println(name[i]+"의 점수를 입력하세요");
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
//		System.out.println("총합 : "+sum);
//		System.out.println("평균 : "+avg);
//		System.out.println("최고 : "+max);
		
		
		/* 1번 거꾸로 출력 */
		
//		System.out.println("n을 입력하세요");
//		int n = in.nextInt();
//		int [] arr = new int [n];
//		
//		System.out.println("n번 입력하세요");
//		for (int i=0; i<arr.length; i++) {
//			arr[i] = in.nextInt();
//		}
//		
//		for (int i=arr.length-1; i>=0; i--) {
//			System.out.print(arr[i]+" ");
//		}
		
		
		/* 2번 로테이션 */
		
//		System.out.println("n을 입력하세요");
//		int n = in.nextInt();
//		int [] arr = new int [n];
//		
//		System.out.println("n번 입력하세요");
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
		
		
		/* 3번 괄호갯수 */
		
//		int open = 0;
//		int close = 0;
//		
//		System.out.println("문자열입력");
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

		
		/*4번 알파벳*/
		
//		char [] alphas = new char [26];
//		int [] cnt = new int [26];
//		
//		System.out.println("문자열입력");
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
		
		
		/* 5번 중복ㄴㄴ 다시입력 10개만 */

//		int[] numbers = new int[10];
//		
//		for(int i =0; i < numbers.length; i++) {
//			
//			while(true) {
//				numbers[i]  = in.nextInt();//numbers 배열의 i번째에 값 입력받기
//				boolean find = false;
//				for(int j = 0; j < i; j++) {
//					if( numbers[j] == numbers[i] ) { //numbers배열의 j번째와 i번째가 같으면
//						find = true;
//					}
//				}
//				
//				if(!find) {
//					break;
//				}else {
//					System.out.println("중복입니다. 다시입력하세요");
//				}
//			}//while루프
//		}//for루프
//		
//		System.out.println("입력된 수는 다음과 같습니다.");
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}

		
		/* 6번 2차원배열 오른쪽으로 */
		
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

		
		
		/* 7번 아래로 */
		
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
		
		/* 9번 달팽이 */

//		System.out.println("숫자 n을 입력하세요");
//		int n = in.nextInt();
//		int [][] map = new int [n][n];
//		
//		int first = 0;
//		int last = n-1;
//		int value = 1;
//		
//		for (int i=0; i<n; i++) {
//			if (i%2==0) { //위
//				for (int j=first;j<=last; j++) {
//					map[first][j] = value;
//					value++;
//				}first++;
//			}else { //아래
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
package main;

import java.util.Scanner;

public class MyBlackJack20104 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("카드의 개수를 입력하세요.");
		int X = 0;
		while (true) {
			X = in.nextInt();
			if ((X <= 100) && (X >= 3)) { // 3 <= X <= 100사이에 있으면 끝
				break;
			} else { // 아니면 다시 입력
				System.out.println("다시 입력해주세요.");
			}
		}

		System.out.println("합의 범위를 입력해주세요.");
		int Z = 0;
		while (true) {
			Z = in.nextInt();
			if ((Z <= 30000) && (Z >= 10)) { // 10 <= Z <= 30000사이에 있으면 끝
				break;
			} else { // 아니면 다시 입력
				System.out.println("다시 입력해주세요.");
			}
		}

		int[] num = new int[X];

		System.out.println(X + "번 카드의 숫자를 입력하세요");
		for (int i = 0; i < num.length; i++) {
			num[i] = in.nextInt();
			if (num[i] <= 0) {
				i--; // 0이 안 넘으면 i--를 해서 X 번 입력할 수 있도록 한다.
				System.out.println("0이 넘어야합니다.");
			}
		}

		MyBlackJack(X, Z, num); // 카드개수, 합의범위, 카드숫자

	}

	public static void MyBlackJack(int X, int Z, int[] num) {
		int max = 0;

		for (int i = 0; i < X - 1; i++) {
			for (int j = i + 1; j < X - 1; j++) {
				for (int z = j + 1; z < X; z++) {
					int sum = num[i] + num[j] + num[z]; // 삼중포문으로 합 구하기
					if (sum == Z) { // 만약 합이랑 합의범위(범위의 최대값??)이랑 같으면 합계 출력
						System.out.println(sum);
						return;
					} else if (Z > sum) { // 만약 sum이 Z보다 작으면
						if (max < sum) { // 만약 sum이 max보다 큳면
							max = sum; // max는 sum이 된다.
						}
					}
				}
			}
		}

		System.out.println(max);
	}

}

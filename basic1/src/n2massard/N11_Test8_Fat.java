package n2massard;

import java.util.Scanner;

public class N11_Test8_Fat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Ű�� �Է��ϼ���");
		double tall = in.nextInt();
		System.out.println("�����Ը� �Է��ϼ���");
		double kg = in.nextInt();

		double w2 = (tall - 100) * 0.9; // ǥ�� ������ ���ϱ�
		double fat = (kg - w2) * 100 / w2;

		if (fat <= 10) {
			System.out.println(fat + " : �����Դϴ�");
		} else if (fat <= 20) {
			System.out.println(fat + " : ��ü���Դϴ�");
		} else if (fat > 20) {
			System.out.println(fat + " : ���Դϴ�");
		}

	}

}

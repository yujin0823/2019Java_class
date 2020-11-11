package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.N4_Human;

public class N4_AddressApp {
	public static void main(String[] args) {
		N4_Human h1 = new N4_Human("�ּ���", "010-6304-2759", 1);
		N4_Human h2 = new N4_Human("ȫ�浿", "010-6666-7777", 1);
		N4_Human h3 = new N4_Human("�̼���", "010-3333-4444", 1);

		ArrayList<N4_Human> list = new ArrayList<>();
		list.add(h1);
		list.add(h2);
		list.add(h3);

		Scanner in = new Scanner(System.in);

		int no = 0;
		while (no != 4) {
			System.out.println("***** <�޴�> *****");
			System.out.println("*    1.�˻�                *");
			System.out.println("*    2.�Է�                *");
			System.out.println("*    3.����                *");
			System.out.println("*    4.��ü���          *");
			System.out.println("*    5.����                *");
			System.out.println("***************");
			no = in.nextInt();

			if (no <= 0 || no > 4) {
				System.out.println("�߸��� �޴��Դϴ�");
			}

			/* 1�� */

			if (no == 1) {
				System.out.println("�˻��� ���ڸ� �Է��ϼ���");
				String word = in.next();

				for (N4_Human h : list) { // list�ȿ� �ִ°��� h
					if (h.name.contains(word)) {
						System.out.println(h);
					}
				}

			}

			/* 2�� */

			if (no == 2) {
				System.out.println("�̸� �Է�");
				String name = in.next();
				System.out.println("��ȭ��ȣ �Է�");
				String phone = in.next();
				System.out.println("�����ȣ �Է�");
				int s = in.nextInt();

				N4_Human h = new N4_Human(name, phone, s);
				list.add(h);
				System.out.println("�߰��Ǿ����ϴ�");
			}

			/* 3�� */

			if (no == 3) {
				System.out.println("������ �̸��� �Է��ϼ���");
				String name = in.next();

				boolean find = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).name.equals(name)) {
						list.remove(i);
						System.out.println("�����Ǿ����ϴ�");
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("�׷� ��� �����ϴ�.");
				}

				/* break����Ҷ� �� */

//				for (int i=0; i<list.size(); i++) {
//					if (list.get(i).name.contains(word)) {
//						System.out.println(list.get(i));
//					}
//				}
			}

			/* 4�� */

			if (no == 4) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				
//				for (Human h: list) {
//					System.out.println(h);
//				}
			}

		}
	}
}

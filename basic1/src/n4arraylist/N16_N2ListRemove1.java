package n4arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class N16_N2ListRemove1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] arr = { "����", "��ȿ", "����", "�糪", "����", "ä��", "���", "����" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> del = new ArrayList<String>();
		
		System.out.println("�Է��ϼ���");
		while (true) {
			String str = in.nextLine();
			if (str.equals("����")) {
				break;
			}

			int idx = list.indexOf(str);
			if (idx < 0) {
				System.out.println("���������ʽ��ϴ�");
			} else {
				list.remove(str);
				System.out.println("�����Ǿ����ϴ�");
				del.add(str);
			}
		}

		System.out.print("����Ʈ : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		System.out.print("��������Ʈ : ");
		for (int i = 0; i < del.size(); i++) {
			System.out.print(del.get(i) + " ");
		}

	}
}

package n4arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Gondr6SearchName {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String[] names = {"���", "����", "����", "����", "�̳�", "����", "�糪", "��ȿ", "ä��",
				"��", "����", "����ȩ", "��", "����", "RM", "������"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(names));
		
		System.out.println("�Է��ϼ���");
		String str = in.nextLine();
		int idx = list.indexOf(str);
		
		if (idx < 0) {
			System.out.println("���������ʽ��ϴ�");
		}else {
			System.out.println(str+"��(��) "+idx+"���� �ֽ��ϴ�");
		}
		

	}

}

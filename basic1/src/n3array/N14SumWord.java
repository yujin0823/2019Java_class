package n3array;

import java.util.Random;
import java.util.Scanner;

public class N14SumWord {

	public static void main(String[] args) {
		String[] when = {"����", "����", "��"};
		String[] where = {"����", "�б�", "�ܼ�Ʈ", "�츮��", "��۽�", "��ɹ�"};
		String[] who = {"�ֶ�","����","����","ȭ��","������", "�ֿ���"};
		String[] what = {"���� ���", "�̾߱��Ѵ�", "���� �Դ´�", "���", "�����Ѵ�"};
		String[] how = {"�ݷ��ϰ�", "����ְ�", "��ģ����"};
		
		Scanner in = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = in.next();
		Random rnd = new Random();
		
		System.out.println(name + 
		when[rnd.nextInt(3)] + " " +
		where[rnd.nextInt(6)] + "���� " +
		who[rnd.nextInt(6)] + "�� " + 
		how[rnd.nextInt(3)] + " " +
		what[rnd.nextInt(5)]
		);

	}

}

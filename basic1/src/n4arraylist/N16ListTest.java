package n4arraylist;

import java.util.ArrayList;

public class N16ListTest {
	// �ݵ�� ��ü�������θ� ���α׷��� �ؾ� ��
	// js,���̽�,��� ��.. => ��ü����, ��������
	// int => �⺻�ڷ���
	// Create, remove, set, 
	
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<String>();
		// int ��������� Integer
		// Generic
		
		list.add("Hello");
		list.add("World");
		list.add("Gondr");
		
		list.set(1, "World2");
		
//		int idx = list.indexOf("Gondr");
//		System.out.println(idx);
//		list.remove(idx);
		
		list.remove("Gondr");
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
package main;

import model.N5_Book;

public class N5_BookTest {
	public static void main(String[] args) {
		N5_Book book1 = new N5_Book();
		book1.setTitle("��ŵ� �� �� �ִ�! ��ɹ�!");
		
		N5_Book book2 = new N5_Book(
			"��ɹ��̶� �����ΰ�?", 
			"gondr",
			12345678,
			"2019-05-07",
			"�Ƹ��� ����Ʈ �����̰� ���� �ٳⰣ ��ɹ��� ������" +
			" ������ ������ ������ ����� ����");
		
		System.out.println(book1);
		System.out.println(book2);
		
	}
}

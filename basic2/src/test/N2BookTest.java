package test;

import tmodel.Book;

public class N2BookTest {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("��ŵ� �� �� �ִ�! ��ɹ�!");
		
		Book book2 = new Book(
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

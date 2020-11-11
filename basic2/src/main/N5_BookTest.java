package main;

import model.N5_Book;

public class N5_BookTest {
	public static void main(String[] args) {
		N5_Book book1 = new N5_Book();
		book1.setTitle("당신도 할 수 있다! 기능반!");
		
		N5_Book book2 = new N5_Book(
			"기능반이란 무엇인가?", 
			"gondr",
			12345678,
			"2019-05-07",
			"아마존 베스트 셀러이고 싶은 다년간 기능반을 지도한" +
			" 교사의 고통의 나날을 기록한 서적");
		
		System.out.println(book1);
		System.out.println(book2);
		
	}
}

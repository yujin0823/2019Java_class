package n4arraylist;

import java.util.ArrayList;

public class N16ListTest {
	// 반드시 객체지향으로만 프로그래밍 해야 함
	// js,파이썬,루비 등.. => 객체지향, 절차지향
	// int => 기본자료형
	// Create, remove, set, 
	
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<String>();
		// int 쓰고싶으면 Integer
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
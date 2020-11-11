package n4arraylist;

import java.util.ArrayList;

public class Gondr1ListTest {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		myList.add(5);
		myList.add(10);
		myList.add(1,12);
		
//		myList.set(2,15);
//		myList.remove(1);
		
		if (myList.contains(12)) {
			System.out.println("숫자 12가 존재합니다");
		}
		
		int index = myList.indexOf(12);
		System.out.println("12는 "+index+"번에 있습니다");
		
		for (int i=0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		/*위에랑 똑같은 방법*/
		
//		for (Integer element : myList) {
//			System.out.println(element);
//		}

	}

}

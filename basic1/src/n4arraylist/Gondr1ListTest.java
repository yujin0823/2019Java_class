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
			System.out.println("���� 12�� �����մϴ�");
		}
		
		int index = myList.indexOf(12);
		System.out.println("12�� "+index+"���� �ֽ��ϴ�");
		
		for (int i=0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		/*������ �Ȱ��� ���*/
		
//		for (Integer element : myList) {
//			System.out.println(element);
//		}

	}

}

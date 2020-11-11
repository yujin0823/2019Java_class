package n4arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Gondr6SearchName {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String[] names = {"모모", "나연", "다현", "쯔위", "미나", "정연", "사나", "지효", "채영",
				"뷔", "슈가", "제이홉", "진", "지민", "RM", "아이유"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(names));
		
		System.out.println("입력하세요");
		String str = in.nextLine();
		int idx = list.indexOf(str);
		
		if (idx < 0) {
			System.out.println("존재하지않습니다");
		}else {
			System.out.println(str+"은(는) "+idx+"번에 있습니다");
		}
		

	}

}

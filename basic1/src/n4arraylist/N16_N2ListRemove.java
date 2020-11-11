package n4arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class N16_N2ListRemove {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String [] arr = {"쯔위", "지효", "다현", "사나", "나연", "채영", "모모", "정연"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		
		System.out.println("입력하세요");
		while (true) {
			String str = in.nextLine();
			if (str.equals("종료")) {
				break;
			}
			
			int idx = list.indexOf(str);
			if (idx<0) {
				System.out.println("존재하지않습니다");
			}else {
				list.remove(str);
				System.out.println("삭제되었습니다");
			}
		}
		
		System.out.print("리스트 : ");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}
}

package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.N4_Human;

public class N4_AddressApp {
	public static void main(String[] args) {
		N4_Human h1 = new N4_Human("최선한", "010-6304-2759", 1);
		N4_Human h2 = new N4_Human("홍길동", "010-6666-7777", 1);
		N4_Human h3 = new N4_Human("이순신", "010-3333-4444", 1);

		ArrayList<N4_Human> list = new ArrayList<>();
		list.add(h1);
		list.add(h2);
		list.add(h3);

		Scanner in = new Scanner(System.in);

		int no = 0;
		while (no != 4) {
			System.out.println("***** <메뉴> *****");
			System.out.println("*    1.검색                *");
			System.out.println("*    2.입력                *");
			System.out.println("*    3.삭제                *");
			System.out.println("*    4.전체출력          *");
			System.out.println("*    5.종료                *");
			System.out.println("***************");
			no = in.nextInt();

			if (no <= 0 || no > 4) {
				System.out.println("잘못된 메뉴입니다");
			}

			/* 1번 */

			if (no == 1) {
				System.out.println("검색할 문자를 입력하세요");
				String word = in.next();

				for (N4_Human h : list) { // list안에 있는것이 h
					if (h.name.contains(word)) {
						System.out.println(h);
					}
				}

			}

			/* 2번 */

			if (no == 2) {
				System.out.println("이름 입력");
				String name = in.next();
				System.out.println("전화번호 입력");
				String phone = in.next();
				System.out.println("단축번호 입력");
				int s = in.nextInt();

				N4_Human h = new N4_Human(name, phone, s);
				list.add(h);
				System.out.println("추가되었습니다");
			}

			/* 3번 */

			if (no == 3) {
				System.out.println("삭제할 이름을 입력하세요");
				String name = in.next();

				boolean find = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).name.equals(name)) {
						list.remove(i);
						System.out.println("삭제되었습니다");
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("그런 사람 없습니다.");
				}

				/* break사용할때 편리 */

//				for (int i=0; i<list.size(); i++) {
//					if (list.get(i).name.contains(word)) {
//						System.out.println(list.get(i));
//					}
//				}
			}

			/* 4번 */

			if (no == 4) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				
//				for (Human h: list) {
//					System.out.println(h);
//				}
			}

		}
	}
}

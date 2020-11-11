package main;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		char[] alphas = new char[26];

		for (int i = 0; i < alphas.length; i++) {
			alphas[i] = (char) ('a' + i);
		}

		System.out.println("입력자료의 개수를 입력해주세요.");
		int N = in.nextInt();

		System.out.println(N + "번의 단어를 입력해주세요. (알파벳)");
		String[] word = new String[N];
		for (int i = 0; i < word.length; i++) {
			word[i] = in.next();

			for (int j = 0; j < i; j++) { // 중복검색
				if (word[i].equals(word[j])) {
					System.out.println("중복되는 문자입니다. 다시 입력해주세요.");
					i--;
				}
			}
		}

		boolean t = false;
		int cnt = 0;
		
		for (int i = 0; i < word.length-1; i++) {
			for (int j = 0; j<word[i].length(); j++) {
				char c = word[i].charAt(j);
				char c2 = word[i+1].charAt(j);
				
//				c = c2;
				
				String str = word[i].replace(c, c2);
				for (int z = 0; z<word[i].length(); z++) {
					char c3 = word[i].charAt(z);
					if (c == c3) {
						if (i == z) {
							break;
						}else {
							c = c2;
						}
//						c = c2;
					}
				}
				
				if (c == c2) {
					t = true;
				}else if (c != c2){
					t = false;
				}
				
//				c = word[i].charAt(j);
//				c2 = word[i+1].charAt(j);
			}
			
			if (t = true) {
				System.out.println(word[i] + ", " + word[i+1]);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}

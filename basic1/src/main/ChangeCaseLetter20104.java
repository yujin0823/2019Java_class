package main;

import java.util.Scanner;
// 2번 조건에서 영문자 + 숫자 일때 "영문자가 아닙니다" 출력
public class ChangeCaseLetter20104 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("영문자들을 입력하시오.");
		String str = "";
		char ch;
		boolean tf = true;
		while (true) {
			str = in.nextLine();
			if (str.length() > 50) {
				System.out.println("너무 길어요. 다시 입력해주세요.");
			} else {
				break;
			}
		}

		int cnt = 0;
		boolean noEng = false;
		while (tf) {
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
					cnt++;
					tf = false;
				}
			}
			if (cnt == 0) {
				System.out.println("영문자가 아닙니다.");
				noEng = true;
				tf = false;
			}
		}

		char[] arr = new char[str.length()];
		boolean num = false;

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			if (arr[i] >= 65 && arr[i] <= 90) { // 대문자이면
				arr[i] += 32; // 소문자로 변환
			} else if (arr[i] >= 97 && arr[i] <= 122) { // 소문자이면
				arr[i] -= 32; // 대문자로 변환
			} else {
				arr[i] = ' ';
			}
			
//			System.out.print(arr[i]);

			if (!(arr[i] >= 97 && arr[i] <= 122) && !(arr[i] >= 65 && arr[i] <= 90)) {
				num = true;
				arr[i] = ' ';
			}
		}

		boolean numEng = false;
		for (int i = 0; i < str.length(); i++) {
			if (num == true && noEng == false) { //숫자도 있고 영어도 있고
//				System.out.println(str);
				System.out.print(arr[i]);
				numEng = true;
//				break;
			} else {
				System.out.print(arr[i]);
			}
		}
		
		if (numEng == true) {
			System.out.print("영문자가 아닙니다.");
		}
	
		System.out.println("\n입력받은 문자열중 영글자의 수 : " + cnt);
	}

}

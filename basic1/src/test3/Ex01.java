package test3;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int dbId = 1111;
		int dbPw = 1234;

		System.out.println("[로그인]");
		System.out.println("ID를 입력하세요");
		int myId = scan.nextInt();

		if (dbId == myId) { // 만약 dbId, myId 같다면 pw를 입력
			System.out.print("PW를 입력하세요 : ");
			int myPw = scan.nextInt();

			if (dbPw == myPw) { // id,pw 같다면 아래 실행 -> 로그인 성공
				System.out.println("[메세지]로그인 성공");
			} else { // id같지만 pw다르면 확인
				System.out.println("[메세지]PW를 확인해주세요.");
			}
		} else { // id다르면 확인
			System.out.println("[메세지]ID를 확인해주세요.");
		}
		scan.close();
	}

}

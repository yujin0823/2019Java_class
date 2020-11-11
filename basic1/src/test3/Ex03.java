package test3;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int acc1 = 1111;
		int pw1 = 1234;
		int money1 = 10000;

		int acc2 = 2222;
		int pw2 = 1234;
		int money2 = 20000;

		/*
		 * # log 값의 의미 (1)로그아웃 : -1 (2)acc1 로그인 : 1 (3)acc2 로그인 : 2
		 */
		int log = -1;

		while (true) { // 아무도 로그인하지않은 상태
			System.out.println("[MEGA ATM]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]입금");
			System.out.println("[4]출금");
			System.out.println("[5]이체");
			System.out.println("[6]잔액조회");
			System.out.println("[0]종료");

			System.out.print("메뉴를 선택하세요 : ");
			int sel = scan.nextInt();

			if (sel == 1) { // 로그인
				if (log == -1) {
					System.out.println("[로그인]계좌번호를 입력하세요");
					int myAcc = scan.nextInt();
					System.out.println("[로그인]비밀번호를 입력하세요");
					int myPw = scan.nextInt();

					if (myAcc == acc1 && myPw == pw1) { // id1와 pw1가 각각 같을때
						log = 1;
						System.out.println("[메세지]1111님 환영합니다.");
					} else if (myAcc == acc2 && myPw == pw2) { // id2와 pw2가 각각 같을때
						log = 2;
						System.out.println("[메세지]2222님 환영합니다.");
					}else { // 둘다 아니면
						System.out.println("계좌번호와 비밀번호를 확인해주세요.");
					}
				} else {
					if (log == 1) {
						System.out.println("[메세지]현재 1111님 로그인 중입니다.");
					}else if (log == 2) {
						System.out.println("[메세지]현재 2222님 로그인 중입니다.");
					}
				}

			} else if (sel == 2) { // 로그아웃
				if (log != -1) { // 로그아웃상태(-1)아니면
					log = -1;
					System.out.println("[메세지]로그아웃이 되었습니다.");
				}else {
					System.out.println("[메세지]로그인 후 이용해 주세요.");
				}
			} else if (sel == 3) { // 입금
				if (log != -1) {
					System.out.println("[입금]금액을 입력하세요.");
					int money = scan.nextInt();

					if (log == 1) {
						money1 += money;
					} else if (log == 2) {
						money2 += money;
					}
					System.out.println("[메세지]입금을 완료하였습니다.");
				} else {
					System.out.println("[메세지]로그인 후에 이용해주세요.");
				}
			} else if (sel == 4) { // 출금
				if (log != -1) {
					System.out.println("[출금]금액을 입력하세요.");
					int money = scan.nextInt();

					if (log == 1) {
						if (money1 >= money) { // 가지고 있는 돈이 더 많으면
							money1 = money1 - money;
						} else {
							System.out.println("돈이 없어요.");
						}
					} else if (log == 2) {
						if (money2 >= money) { // 가지고 있는 돈이 더 많으면
							money2 = money2 - money;
						} else {
							System.out.println("돈이 없어요.");
						}
					}
				} else {
					System.out.println("[메세지]로그인 후 이용해 주세요.");
				}
			} else if (sel == 5) { // 이체
				if (log != -1) {
					System.out.println("[이체]계좌번호를 입력하세요.");
					int acc = scan.nextInt();

					if (log == 1 && acc == acc2) {
						System.out.println("이체할 금액을 입력하세요.");
						int money = scan.nextInt();

						if (money1 >= money) { // 가지고 있는 돈이 더 많으면
							money1 = money1 - money;
							money2 = money2 + money;
							System.out.println("[이체]가 완료되었습니다.");
						} else {
							System.out.println("[메세지]계좌잔액이 부족합니다.");
						}
					} else if (log == 2 && acc == acc1) {
						System.out.println("이체할 금액을 입력하세요.");
						int money = scan.nextInt();

						if (money2 >= money) { // 가지고 있는 돈이 더 많으면
							money1 = money1 + money;
							money2 = money2 - money;
							System.out.println("[이체]가 완료되었습니다.");
						} else {
							System.out.println("[메세지]계좌잔액이 부족합니다.");
						}
					} else {
						System.out.println("[메세지]로그인 후 이용해 주세요.");
					}
				}
			} else if (sel == 6) { // 현재돈
				if (log != -1) {
					if (log == 1) {
						System.out.println("현재 돈 : " + money1);
					} else if (log == 2) {
						System.out.println("현재 돈 : " + money2);
					}
				} else {
					System.out.println("[메세지]로그인 후 이용해 주세요.");
				}
			} else if (sel == 0) {
				System.out.println("[메세지]프로그램 종료");
				break;
			}

		}

		scan.close();

	}

}

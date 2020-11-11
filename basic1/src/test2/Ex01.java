package test2;

/*
 * # 과락[문제]  5분 컷
 * 1. 아래 세 과목의 성적 평균이 80점 이상이면 합격생이다.
 *    세 과목의 성적은 클래스룸에서 공지함. 
 * 2. 단, 어느 한 과목이라도 점수가 60점 미만이면 불합격생이다.
 * 3. 합격 여부를 출력한다.
 * 4. // 주석 처리된 부분을 해제하여 오류없는 프로그램을 완성한다.
 * 5. 필요한 데이터 타입은 직접 선언한다.
 *    예) check와 pass의 데이터 타입은? 
 */

public class Ex01 {
	public static void main(String[] args) {

		int kor = 94;
		int eng = 78;
		int math = 60;
		
		String pass = "";
		boolean check = true;
		if ((kor + eng + math) >= 80 && kor >= 60 && eng >= 60 && math >= 60) {
			check = true;
		}else {
			check = false;
		}
				
		if(check == true){
			pass = "합격입니다";
		}else{
			pass = "불합격입니다";
		}
		
		System.out.println(pass);
	}
}

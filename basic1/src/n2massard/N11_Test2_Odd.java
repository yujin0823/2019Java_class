package n2massard;

public class N11_Test2_Odd {

	public static void main(String[] args) {
		oddPrint(15); // 출력됨
		oddPrint(10); // 출력안됨

	}

	public static void oddPrint(int x) {
		// 적절한 코드를 이곳에 작성

		if (x % 2 != 0) {
			System.out.println(x + "홀수입니다");
		}

	}
}

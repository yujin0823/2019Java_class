package n2massard;

public class N11_Test2_Odd {

	public static void main(String[] args) {
		oddPrint(15); // ��µ�
		oddPrint(10); // ��¾ȵ�

	}

	public static void oddPrint(int x) {
		// ������ �ڵ带 �̰��� �ۼ�

		if (x % 2 != 0) {
			System.out.println(x + "Ȧ���Դϴ�");
		}

	}
}

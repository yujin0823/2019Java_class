package n2massard;

public class N10_Gondr3_Pyramid {

	public static void main(String[] args) {
		// 4��¥�� �Ƕ�̵� ���
		printPyramid(4);

		// 7��¥�� �Ƕ�̵� ���
		printPyramid(7);

	}
	
	public static void printPyramid(int level) {
		for(int i=1; i<=level; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

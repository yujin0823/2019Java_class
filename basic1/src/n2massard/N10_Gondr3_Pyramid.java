package n2massard;

public class N10_Gondr3_Pyramid {

	public static void main(String[] args) {
		// 4층짜리 피라미드 찍기
		printPyramid(4);

		// 7층짜리 피라미드 찍기
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

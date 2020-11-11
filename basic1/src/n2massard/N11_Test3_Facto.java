package n2massard;

public class N11_Test3_Facto {

	public static void main(String[] args) {
		int ten = factorial(10);
		int hund = factorial(15);
		
		System.out.println("10 = " + ten);
		System.out.println("15 =" + hund);

	}
	
	public static int factorial(int n) {
		int factoSum = 1;
		
		for(int i=1; i<=n; i++) {
			factoSum = factoSum*i;
		}
		
		System.out.println(factoSum);
		
		return factoSum;
	}

}

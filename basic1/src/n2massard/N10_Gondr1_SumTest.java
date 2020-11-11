package n2massard;

public class N10_Gondr1_SumTest {

	public static void main(String[] args) {
		System.out.println(sum(0,10));
		System.out.println(sum(11,100));
		System.out.println(sum(101,1000));

	}
	
	public static int sum(int start, int end) {
		int result = 0;
		for(int i=start; i<=end; i++) {
			result += i;
		}
		return result;
	}

}

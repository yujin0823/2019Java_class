package n2massard;

public class N10_Gondr5_MethodTest2 {

	public static void main(String[] args) {
		System.out.println(sum("Hello","World"));
		System.out.println(sum(10,20));

	}
	
	public static String sum(String a, String b) {
		return "입력된 문자열 : " + a + b;
	}
	
	public static String sum(int a, int b) {
		return "입력된 숫자의 합 : "+(a+b);
	}

}

package n2massard;

public class N10_Gondr6_MethodTest3 {

	public static void main(String[] args) {
		System.out.println(sum("안녕하세요", "양영디지털 여러분"));
		System.out.println(sum(4,5));
		System.out.println(sum(5,7,9));

	}
	
	public static String sum (String a, String b) {
		return "문자의 합 : " + (a+b);
	}
	
	public static String sum (int a, int b) {
		return "숫자의 합 : " + (a+b);
	}
	
	public static String sum (int c, int d, int e) {
		return "숫자의 합 : " + (c+d+e);
	}

}

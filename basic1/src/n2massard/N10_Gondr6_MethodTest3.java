package n2massard;

public class N10_Gondr6_MethodTest3 {

	public static void main(String[] args) {
		System.out.println(sum("�ȳ��ϼ���", "�翵������ ������"));
		System.out.println(sum(4,5));
		System.out.println(sum(5,7,9));

	}
	
	public static String sum (String a, String b) {
		return "������ �� : " + (a+b);
	}
	
	public static String sum (int a, int b) {
		return "������ �� : " + (a+b);
	}
	
	public static String sum (int c, int d, int e) {
		return "������ �� : " + (c+d+e);
	}

}

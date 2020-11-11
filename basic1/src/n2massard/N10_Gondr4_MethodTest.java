package n2massard;

public class N10_Gondr4_MethodTest {

	public static void main(String[] args) {
		echo("Hello! Y-Y Digital's sofrware developer", 10);
		echo("abcdefg",3);

	}
	
	public static void echo(String msg, int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.println(msg);
		}
	}

}

package main;

public class ForLoop { //무한루프
	public static void main(String[] argv) {
		int total = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; i++) {
				total++;
			}
		}
		System.out.println(total);
	}
}

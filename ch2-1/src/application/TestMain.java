package application;

public class TestMain {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("익명 클래스 예제");
			}
		};
		
		Runnable r2 = () -> {System.out.println("익명예제2"); };
		
		r.run();

	}
}

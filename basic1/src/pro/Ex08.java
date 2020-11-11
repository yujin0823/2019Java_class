package pro;

class Test {
	void test1(int x) {
		x = 100;
	}

	int test2() {
		int x = 100;
		return x;
	}

	void test3(int[] arr) {
		arr[1] = 77;
	}
}

public class Ex08 {

	public static void main(String[] args) {

		Test e = new Test();

		int x = 7;
		System.out.println("x = " + x);

		e.test1(x);
		System.out.println("x1 = " + x);

		x = e.test2();
		System.out.println("x2 = " + x);

		int[] arr = { 10, 20, 30, 40, 50 };
		e.test3(arr);

		System.out.println(arr[1]);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

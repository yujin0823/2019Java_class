package views;

public class Model {
						//연산자
	public int calculate(String operator, int x, int y) {
		switch (operator) {
		case "+":
			return x + y;
		case "-":
			return x - y;
		case "*":
			return x * y;
		case "/":
			return x / y;

		default:
			return 0;
		}
	}
}

package task2;

import main2.Calculator;

public class User1 extends Thread{
	private Calculator calc;
	
	public void setCalc(Calculator calc) {
		this.setName("User1 쓰레드");
		this.calc = calc;
	}
	
	public void run() {
		calc.setmemory(200);
	}
}

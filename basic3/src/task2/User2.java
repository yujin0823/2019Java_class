package task2;

import main2.Calculator;

public class User2 extends Thread{
	private Calculator calc;
	
	public void setCalc(Calculator calc) {
		this.setName("User2 쓰레드");
		this.calc = calc;
	}
	
	public void run() {
		calc.setmemory(400);
	}
}

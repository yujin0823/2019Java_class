package task;

import main.Calculator;

public class User2 extends Thread {
	private Calculator cal;

	public void setCalc(Calculator cal) {
		this.setName("User2 쓰레드");
		this.cal = cal;
	}

	public void run() {
		cal.setMemory(400);
	}
}

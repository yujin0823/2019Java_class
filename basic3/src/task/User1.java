package task;

import main.Calculator;

public class User1 extends Thread{
	private Calculator cal;
	
	public void setCalc(Calculator cal) {
		this.setName("User1 쓰레드");
		this.cal = cal;
	}
	
	public void run() {
		cal.setMemory(200);
	}
}

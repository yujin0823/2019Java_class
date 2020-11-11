package main;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}
	
	//임계영역 Critical Zone
	public synchronized void setMemory(int value) {
		this.memory = value;
		try {Thread.sleep(2000);} catch (Exception e) {}
		
		System.out.println(Thread.currentThread().getName()
				+ " -할당한 값 : " + value
				+ ", 할당된 값 : " + this.memory);
	}
	
	
}

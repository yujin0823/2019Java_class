package main2;

public class Calculator {
	private int memory;
	
	public int getmemory() {
		return memory;
	}
	
	public synchronized void setmemory(int value) {
		//synchronized안쓰면     User2 쓰레드- 할당한 값 : 400, 할당된 값 :400
		//				     User1 쓰레드- 할당한 값 : 200, 할당된 값 :400
		this.memory = value;
		//매개값을 저장하고 고의적으로 2초 대기함.
		try {	Thread.sleep(2000);	} catch (Exception e) {}
		System.out.println(Thread.currentThread().getName() 
				+ "- 할당한 값 : " + value + ", 할당된 값 :" + + this.memory);
	}
 }

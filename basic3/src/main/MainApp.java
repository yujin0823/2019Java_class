package main;

import task.BeepTask;

public class MainApp {

	public static void main(String[] args) {
//		User1 u1 = new User1();
//		User2 u2 = new User2();
//		
//		Calculator cal = new Calculator();
//		
//		u1.setCalc(cal);
//		u2.setCalc(cal);
//		
//		u1.start();
//		u2.start();
		
		Thread t1 = new Thread(new BeepTask());
		t1.setName("t1");
		t1.start();
		
		Thread t2 = new Thread(new BeepTask());
		t2.setName("t2");
		t2.start();
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
		
		for (int i=0; i<5; i++) {
			System.out.println("띠리링");
			try {Thread.sleep(500);} catch (Exception e) {}
		}

	}

}

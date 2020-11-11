package main2;

import task2.BeepTask2;

public class MainApp2 {
	public static void main(String[] args) {
		Thread t = new Thread(new BeepTask2());
		System.out.println(t.getName());
		t.start();
		
		Thread t2 = Thread.currentThread(); //지금 실행하고 있는 쓰레드 가져올때 (띠리링)
		System.out.println(t2.getName());
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띠리링");
			try { Thread.sleep(500);	} catch (Exception e) {	}
		}
	}
}

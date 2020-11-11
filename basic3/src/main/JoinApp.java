package main;

import task.NumThread;

public class JoinApp {
	public static void main(String[] args) {
		
		NumThread n1 = new NumThread(100);
		NumThread n2 = new NumThread(1000);
		NumThread n3 = new NumThread(10000);
		NumThread n4 = new NumThread(100000);
		n1.start();
		n2.start();
		n3.start();
		n4.start();
		try {
			n1.join();
			n2.join();
			n3.join();
			n4.join();
		} catch (Exception e) {
			System.out.println("쓰레드 대기중 오류 발생");
		}
		System.out.println("합 : " + (n1.getSum() 
		+ n2.getSum() + n3.getSum() + n4.getSum()));
	}
}

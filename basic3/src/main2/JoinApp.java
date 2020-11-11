package main2;

import task2.SumThread;

public class JoinApp {
	public static void main(String[] args) {
		SumThread t = new SumThread();
		t.start();
		
		//쓰레드에서 합을 구하기도 전에 출력했기 때문에 0이 나온다 (join쓰기 전)
		try {
			t.join(); //대기
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("쓰레드 대기중 오류 발생");
		}
		
		System.out.println("100000까지의 합 : " + t.getSum());
		
	}
}

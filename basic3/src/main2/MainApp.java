package main2;

import java.awt.Toolkit;

public class MainApp {
	public static void main(String[] args) {
		//Toolkit은 소리를 출력하기 위해 가져온 Swing의 클래스
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i=0; i<5; i++) {
			toolkit.beep(); //beep() 매서드를 사용하면 비프음을 재생
			try {
				Thread.sleep(600); //sleep매서드로 0.5초간 정지
			} catch (Exception e) {
				//do noting
			}
		}
		
		for (int i=0; i<5; i++) {
			System.out.println("띠리링!!");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				//do noting
			}
		}
	}
}

package task2;

import java.awt.Toolkit;
// runnable은 쓰레드에서 구동가능한 작업을 뜻
public class BeepTask2 implements Runnable{
	//그러므로 실행하는 메서드를 만들어 주어야한다.
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {	Thread.sleep(500);	} catch (Exception e) {	}
		}
		
	}
	
}

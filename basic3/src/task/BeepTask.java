package task;

import java.awt.Toolkit;
import java.util.Random;

public class BeepTask implements Runnable{

	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		String name = Thread.currentThread().getName();
		Random rnd = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "가 소리냅니다.");
			tk.beep();
			try {Thread.sleep(rnd.nextInt(900) + 100);} catch (Exception e) {}
		}
	}
	
}

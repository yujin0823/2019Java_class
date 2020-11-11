package task;

import javafx.application.Platform;
import javafx.scene.control.Label;

public class CountThread extends Thread{
	private Label h;
	private Label m;
	private Label s;
	private long sec;
	
	public CountThread(Label h, Label m, Label s, long sec) {
		this.h = h;
		this.m = m;
		this.s = s;
		this.sec = sec;
	}
	
	private boolean status = true;
	private boolean first = true;
	private boolean quit = false; //종료용 코드
	
	public void setQuit() {
		quit = true;
	}
	
	@Override
	public void run() {
		while(!quit) {
			try {
				Thread.sleep(1000);
				if(!status) {
					continue;
				}
				sec++;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("쓰레드 실행 중 오류 발생");
			}
			
			Long hour = sec / 3600;
			Long min = sec % 3600 / 60;
			Long second = sec % 60;
			
			Platform.runLater(()->{
				String hh = "00" + hour.toString();
				hh = hh.substring(hh.length() - 2, hh.length());
				String mm = "00" + min.toString();
				mm = mm.substring(mm.length() - 2, mm.length());
				String ss = "00" + second.toString();
				ss = ss.substring(ss.length() - 2, ss.length());
				
				h.setText(hh);
				m.setText(mm);
				s.setText(ss);
			});
			
		}
	}
	
	public void startCount() {
		if(first) {
			this.start();
			first = false;
		}else {
			status = true;
		}
	}
	
	public void pauseCount() {
		status = false;
	}
	
	public void stopCount() {
		status = false;
		sec = 0; //초기화까지 같이 해준다.
		Platform.runLater(() -> {
			h.setText("00");
			m.setText("00");
			s.setText("00");
		});
	}
}

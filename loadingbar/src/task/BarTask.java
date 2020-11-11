package task;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class BarTask extends Thread {

	private Label lblStatus;
	private ProgressBar bar;

	private boolean status = true;
	private boolean first = true;
	private boolean stop = false; // 종료코드

	public void setStop() {
		stop = true; // 쓰레드 종료
	}

	public BarTask(Label lblStatus, ProgressBar bar) {
		this.lblStatus = lblStatus;
		this.bar = bar;
	}

	private double current = 0;

	@Override
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(100);
				if(!status) {
					continue;
				}
			} catch (Exception e) {

			}
			current += 0.001;
			Platform.runLater(() -> {
				bar.setProgress(current);
				lblStatus.setText(Math.round(current * 1000) / 10.0 + "%");
			});
		}
	}

	public void startCount() {
		if (first) {
			this.start(); // 시작
			first = false;
		} else {
			status = true; // 최초시작이 아닌경우 status만 변경
		}
	}

	public void pauseCount() {
		status = false; // 일시정지 상태
	}

	public void stopCount() {
		status = false;
		current = 0;
		lblStatus.setText("0%");
	}

}

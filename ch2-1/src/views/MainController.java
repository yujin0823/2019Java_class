package views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import task.CountThread;

public class MainController {
	@FXML
	private Label hour;
	
	@FXML
	private Label minute;
	
	@FXML
	private Label second;
	
	@FXML
	private Button startBtn;
	
	private long sec = 0;
	
	private CountThread t;
	private boolean status = false;
	
	@FXML
	private void initialize() {
		t = new CountThread(hour, minute, second, 0);
	}
	
	public void start() {
		if(!status) {
			t.startCount();
			startBtn.setText("일시정지");
			status = true;
		}else {
			t.pauseCount();
			startBtn.setText("재시작");
			status = false;
		}
	}
	
	public void stop() {
		t.stopCount();
		startBtn.setText("시작");
		status = false;
	}
	
	public void exitApplication() {
		t.setQuit();
	}
}

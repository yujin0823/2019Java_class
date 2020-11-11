package views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import task.BarTask;

public class MainController {
	@FXML
	private ProgressBar bar;
	
	@FXML
	private Label lblStatus;
	
	@FXML
	private Button btnStart;
	@FXML
	private Button btnPause;
	@FXML
	private Button btnStop;
	
	private BarTask task;
	private boolean status = false;
	
	public void start() { //시작
		task = new BarTask(lblStatus, bar);
		task.startCount();
		status = true;
	}
	
	public void pause() { //정지
		task.pauseCount();
		status = false;
	}
	
	public void stop() { //초기화
		task.stopCount();;
		status = false;
	}
	
	public void stopThread() {
		task.setStop(); //쓰레드를 종료시키도록 함.
	}
}

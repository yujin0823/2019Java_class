package net.gondr.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import net.gondr.domain.ScoreVO;
import net.gondr.tetris1.App;
import net.gondr.tetris1.Game;

public class MainController {
	@FXML
	private Canvas gameCanvas;
	
	@FXML
	private Canvas nextBlockCanvas;
	
	@FXML
	private Canvas nextBlock2Canvas;
	
	@FXML
	private Label scoreLabel;
	
	@FXML
	private ListView<ScoreVO> topScoreList;
	
	private ObservableList<ScoreVO> list;
	
	@FXML
	public void initialize() { // 초기화
		System.out.println("메인 레이아웃 초기화 완료");
//		System.out.println("메인 앱은");
//		System.out.println(App.app);
		list = FXCollections.observableArrayList();
		topScoreList.setItems(list);
		App.app.game = new Game(gameCanvas, nextBlockCanvas, scoreLabel, list, nextBlock2Canvas);
	}
	
	public void gameStart() {
		App.app.game.gameStart();
	}
	
	public void stop() {
		App.app.game.pauseCount();
	}
	
	public void reset() {
		App.app.game.reset();
	}
}

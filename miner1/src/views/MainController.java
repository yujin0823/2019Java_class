package views;

import game.GameUtil;
import game.MainGame;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class MainController {
	@FXML
	private Canvas canvas;
	
	private MainGame game;
	
	@FXML
	private Button start;
	
	@FXML
	private Label flagNum;
	
//	private int flag;
	
	@FXML
	private void initialize() {
		
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		game = new MainGame(gc);
		game.render();
	}
	
	public void clickHandle(MouseEvent e) {
		game.clickHandle(e);
//		System.out.println(game.checkFlag());
		int flag = game.getMineCnt() - game.checkFlag();
		//flagNum.setText(game.checkFlag() + "");
		flagNum.setText(flag+" ");
		
	}
	
	@FXML
	public void startGame() {
		GameUtil.alert("지뢰 렛츄고");
		GraphicsContext gc = canvas.getGraphicsContext2D();
		this.game = new MainGame(gc);
		
		int flag = game.getMineCnt() - game.checkFlag();
		game.initGame();
		game.render();
//		flagNum.setText(flag + " ");
		game.isGameOver();
	}
	
}

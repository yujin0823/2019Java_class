package net.gondr.tetris1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import net.gondr.views.ScorePopupController;

public class App extends Application 
{
	//모든 클래스에서 불러오게 하는 것
	public static App app; //설명 듣을려면 code.gondr.net 테트리스강좌 1시간 2분정도 실행
	public Game game = null;
	
	private Stage popupStage;
	private ScorePopupController spController;

	@Override
	public void start(Stage primaryStage) throws Exception {
		app = this;
		System.out.println(this);
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/net/gondr/views/Main.fxml"));
			AnchorPane ap = (AnchorPane) loader.load();
			
			Scene scene = new Scene(ap);
			
			scene.addEventFilter(KeyEvent.KEY_PRESSED, e -> {
				if(game != null) {
					game.keyHandler(e);
				}
			});
			
			FXMLLoader spLoader = new FXMLLoader();
			spLoader.setLocation(getClass().getResource("/net/gondr/views/ScorePopup.fxml"));
			
			popupStage = new Stage();
			popupStage.setTitle("게임기록");
			//모델창으로 만들고 부모를 primaryStage로 기록한다.
			popupStage.initModality(Modality.WINDOW_MODAL);
			popupStage.initOwner(primaryStage);
			
			AnchorPane popup = spLoader.load();
			Scene popScene = new Scene(popup);
			popupStage.setScene(popScene);
			
			spController = spLoader.getController();
			spController.setDialgoStage(popupStage);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("프로그램 로딩중 오류 발생");
		}		
	}
    
	public static void main(String[] args) {
		launch(args);
	}
	
	public void openPopup(int score) {
		spController.setScore(score);
		popupStage.show();
	}
}

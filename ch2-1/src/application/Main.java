package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import views.MainController;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Font.loadFont(getClass().getResourceAsStream("Roboto-Regular.ttf"), 14);

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/views/MainLayout.fxml"));
			AnchorPane root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("타이머");
			primaryStage.show();

			// e는 윈도우객체
			primaryStage.setOnCloseRequest(e -> {
				MainController mc = loader.getController();
				mc.exitApplication();
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

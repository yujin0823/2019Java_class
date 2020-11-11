package application;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			// 여기서부터 센터에 들어갈 HBox
			HBox hbox = new HBox(); // 가로 박스로 설정
			hbox.setAlignment(Pos.CENTER); // 중앙정렬로 변경
			hbox.setSpacing(20); // 컨트롤간의 간격은 20
			
			TextField txtDate = new TextField(); // 텍스트 입력창
			
			Button btn = new Button(); // 버튼
			btn.setText("가져오기");
			hbox.getChildren().addAll(txtDate, btn); // hbox에 button과 TextField가 있다.
			
			// BorderPane의 center에 넣어줌
			root.setCenter(hbox);
			
			// 여기서부터 Bottom에 들어갈 VBox
			VBox vbox = new VBox(); // 세로 박스로 설정
			vbox.setAlignment(Pos.CENTER); // 중앙정렬로 변경
			vbox.setSpacing(20); // 컨트롤간의 간격은 20
			
			Label titleLabel = new Label(); // 라벨
			titleLabel.setText("급식 결과");
			titleLabel.setFont(new Font(25));
			
			Label resultLabel = new Label(); // 라벨
			resultLabel.setText("메뉴가 이곳에 들어갑니다");
			vbox.getChildren().addAll(titleLabel, resultLabel); // vbox에 Label(title, result)가 있다.
			
			//BorderPane의 bottom에 넣어줌
			root.setBottom(vbox);
			
			// btn이 클릭되었을때 이벤트 발생
			btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					// 날짜 입력받기
					String date = txtDate.getText();
					System.out.println(date);
					if (!date.isEmpty()) {
						getMenu(date);
						String result = getMenu(date);
						resultLabel.setText(result); // 아마도 resultLabel에 result를 넣는다
					}
				}
			});
			
			primaryStage.setTitle("오늘의 급식");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public String getMenu(String date) {
		String menu = "";
		
		try {
			Document doc = Jsoup.connect("http://www.y-y.hs.kr/lunch.view?date=" + date).get();
			Element menuDom = doc.select("#morning .menuName > span").first();
			
			menu = menuDom.text();
			
		} catch (Exception e) {
			menu = "해당 일에는 메뉴가 없습니다.";
		}
		
		return menu;
	}
	
}

package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class MainController {
	
	private String operator = ""; //등호를 누르기 전 어떤 연산자를 눌렀는지 알고 저장하기위해
	private int x = 0; //기존의 숫자를 의미
	private Model model = new Model();
	
	@FXML
	private Text result;
	
	@FXML 
	private Button btnClear;
	
	@FXML
	private void operand(ActionEvent event) {
		result.setText(result.getText() + ((Button) event.getSource()).getText());
	}				  //자신이 가지고 있는 텍스트+이벤트가 실행되는 특정 컨테이너(?)의 모든 속성을 가져와 문자열을 가져옴
	
	@FXML
	private void operator(ActionEvent event) {
		if (((Button) event.getSource()).getText().equals("=")) {
			result.setText(model.calculate(operator, x, Integer.parseInt(result.getText())) + "");
		} else {										//y뜻함 문자열로 있기에 숫자로
			operator = ((Button) event.getSource()).getText(); //operator에 현재선택한 연산자넣어
			x = Integer.parseInt(result.getText()); //x에 기존숫자인 y에 해당하는 걸 넣어준다
			result.setText("");
		}
	}
	
	public void Clear(ActionEvent event){
		result.setText("0");
	}
	
}

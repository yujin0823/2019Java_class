package views;

import java.time.LocalDate;

import domain.Todo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import util.AppUtil;

public class MainController {
	@FXML
	private DatePicker datePicker;
	@FXML
	private TextField txtName;
	@FXML
	private Label lblDate;
	@FXML
	private Label lblName;
	
	@FXML
	private ListView<Todo> list;
	
	private ObservableList<Todo> items;
	
	//initialize는 해당 뷰가 로드되어 화면에 나타났을 때 실행되게 된다. p160참고
	@FXML
	private void initialize() {
		// ListView Todo 객체를 담는 것으로 선언했습니다. 
		// ObservableList형태의 List를 만들어서 이를 리스트뷰에 셋팅
		// 이렇게 되면 ObservableList에 값을 변경하면 ListView도 함께 변경
		items = FXCollections.observableArrayList();
		list.setItems(items);
	}
	
	/* 추가 */
	public void addTodo() {
		String name = txtName.getText();
		
		if (name.isEmpty()) {
			AppUtil.alert("할일의 이름을 입력하셔야 합니다.", null);
			return;
		}
	
		LocalDate date = datePicker.getValue();
		if (date == null) { //공통
			AppUtil.alert("날짜를 입력하셔야 합니다.", null);
			return;
		}
		Todo todo = new Todo(name, date);
		items.add(todo);
	}
	
	/* 삭제 */
	public void delTodo() {
		int idx = list.getSelectionModel().getSelectedIndex();
		if (idx >= 0) {
			items.remove(idx);
		}else {
			AppUtil.alert("삭제할 아이템을 선택하세요", "에러");
		}
	}
	
	/* 보기 */
	public void showTodo() {
		// SelectionModel을 사용하여 선택된 아이템의 인덱스를 알아내고 해당 인덱스를 items에서 삭제
		Todo todo = list.getSelectionModel().getSelectedItem();
		if (todo == null) {
			AppUtil.alert("읽을 아이템을 선택하세요", "에러");
			return;
		}
		
		lblDate.setText(todo.getDate().toString());
		lblName.setText(todo.getName());
	}
	
}

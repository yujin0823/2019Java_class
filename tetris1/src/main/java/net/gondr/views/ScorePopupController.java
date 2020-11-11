package net.gondr.views;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import net.gondr.tetris1.App;
import net.gondr.util.JDBCUtil;

public class ScorePopupController {
	@FXML
	private TextField txtName;
	
	@FXML
	private Label lblScore; //점수가 뜨는 라벨
	
	@FXML
	private Label lblError; //에러메시지 보여줄 라벨
	
	private Stage me;
	private int score = 0;
	
	public void setDialgoStage(Stage value) {
		me = value;
	}
	
	public void setScore(int score) {
		this.score = score;
		lblScore.setText("당신의 점수는 " + score + "입니다");
		lblError.setText("");
	}
	
	public void record() {
		//게임점수가 기록되는 핵심 메서드
		if(txtName.getText().isEmpty()) {
			lblError.setText("이름은 공백일 수 없습니ㅏㄷ");
			return;
		}
		
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmc = null;
		String sql = "INSERT INTO tetris (name, score) VALUES ( ?, ? )";
		
		try {
			pstmc = con.prepareStatement(sql);
			pstmc.setString(1, txtName.getText());
			pstmc.setInt(2, score);
			pstmc.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 기록중 오류발생");
		}finally {
			JDBCUtil.close(pstmc);
			JDBCUtil.close(con);
		}
		
		App.app.game.reloadTopScore();
		
		me.close();
	}
}

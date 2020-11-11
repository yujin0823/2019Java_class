package util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class InsertTest {

	public static void main(String[] args) {
		DBUtil db = new DBUtil();

		Connection con = db.getConnection();
		if (con == null) {
			System.out.println("DB연결 오류 발생");
			return;
		}
		//PreparedStatement는 자바에서 SQL문장을 실행할 때 데이터를 연결시키기 위해 사용하는 클래스
		//SQL문에서 값이 들어갈 부분을 전부 ? 로 대체한 후에 prepareStatement를 생성
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO todos (`memo`, `date`) VALUES( ?, ?)";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "테스트용 일정");
			//2번에 매칭될때는 데이터베이스의 날짜 형식은 java.sql.Date인 반면에 현재 DatePicker에서 뽑아낸 날짜는
			//LocalDate형식이기 때문에 변환을 위해서 Date 객체의 valueOf 매서드를 사용해야함.
			pstmt.setDate(2, Date.valueOf(LocalDate.now()));
			//executeUpdate 매서드를 통해서 SQL 문장을 데이터베이스에 실행
			//반환되는 값은 SQL의 실행결과로 반영되는 튜플의 수를 반환한다. 
			//이 예제에서는 하나의 일정이 삽입되게 됨으로 정상적으로 삽입이 이루어졌다면 1이 나와야함.
			int cnt = pstmt.executeUpdate();
			if (cnt == 0) {
				System.out.println("데이터 삽입 실패");
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터 삽입 실패");
			return;
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {

				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {

				}
			}

		}
	}

}

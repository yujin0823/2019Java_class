package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public Connection getConnection() {
		try {
			//MySQL 드라이버를 로딩하는 것
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("드라이버 파일이 존재하지 않습니다.");
			return null;
		}
		
		//데이터베이스 연결을 위해 데이터베이스 주소와 캐릭터 인코딩방식, 보안코드 적용, 시간설정등을 String 변수에 넣어주고 있습니다. 
		//이렇게 연결을 위한 연결 문자열을 Connection String
		String connectionString = "jdbc:mysql://gondr.asuscomm.com/yy_10106"
				+ "?useUnicode=true"
				+ "&characterEncoding=utf8"
				+ "&useSSL=false"
				+ "&serverTimezone=Asia/Seoul";
		
		String userId = "";
		String password = "";
		
		Connection con = null;
		
		try {
			//위의 코드는 입력한 정보로 실제적인 DB에 연결을 하게 되고 연결된 정보를 con 변수에 넣어주게 된다. 
			//con변수를 리턴하여 데이터베이스에 SQL 쿼리를 전송할 수 있다.
			con= DriverManager.getConnection(connectionString, userId, password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 연결중 오류 발생");
		}
		
		return con;
	}
}

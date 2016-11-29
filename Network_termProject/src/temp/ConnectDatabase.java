package temp;
import java.sql.*;
import javax.net.ssl.SSLContext;

import javax.*;
public class ConnectDatabase {
	public static void main(String[] args){
		String url = "jdbc:mysql://127.0.0.1:3306/game";
		String id = "root";
		String password = "12345";
		Connection con = null;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("드라이버 검색 성공 !");
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패 !");
		}
		try {
			con = DriverManager.getConnection(url, id, password);
			System.out.println("My-SQL 접속 성공!!");
		}catch(SQLException e) {
			System.out.println("My-SQL 접속 실패");
		}
	}
}

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
			System.out.println("����̹� �˻� ���� !");
		}
		catch(ClassNotFoundException e) {
			System.out.println("����̹� �˻� ���� !");
		}
		try {
			con = DriverManager.getConnection(url, id, password);
			System.out.println("My-SQL ���� ����!!");
		}catch(SQLException e) {
			System.out.println("My-SQL ���� ����");
		}
	}
}

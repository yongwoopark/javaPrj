package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM MEMBER WHERE MID LIKE '����%'";
		
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		String mid;
		
		while(rs.next()){		//�������� ���ڵ� �ϳ��� �����°ž�
			mid = rs.getString("MID");
			System.out.println(mid);
		}		
	}
}







package StudentDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveOrFaetch {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from school where id=2");
		while(rs.next()) {
			System.out.println("Id: "+rs.getInt(1)+"\nName: "+rs.getString(2)+"\nPhone_No: "+rs.getLong(3));
			System.out.println("=============================");
		}
	}
}

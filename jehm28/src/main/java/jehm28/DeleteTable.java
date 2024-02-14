package jehm28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm28","root","root");
		Statement st = con.createStatement();
		st.execute("delete from jspraj where Id=20");
		
		System.out.println("Records deleted successfully");
		
	}

}

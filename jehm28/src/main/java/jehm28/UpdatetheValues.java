package jehm28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatetheValues {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jehm28","root","root");
		Statement st = con.createStatement();
		st.execute("Update jspraj set name='abhi' where id=20");
		
		System.out.println("Updated successfully");
		
		con.close();
	}
}

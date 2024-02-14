package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateintoEmplist {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","root");
		Statement st = con.createStatement();
		st.execute("Update emplist set id=3 where name='flokee'");
		
		System.out.println("Updated emplist successfully");
		
		con.close();
	}
}

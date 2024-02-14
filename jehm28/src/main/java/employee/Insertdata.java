package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertdata {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement st = con.createStatement();
		st.execute("insert into emplist values(1,'Ragnar',8792552245,'ragnar@gmail.com')");
		st.execute("insert into emplist values(2,'Rollo',8732552245,'rollo@gmail.com')");
		st.execute("insert into emplist values(1,'flokee',8792442245,'flokee@gmail.com')");
		
		System.out.println("Inserted successfully");
		con.close();
	}
}

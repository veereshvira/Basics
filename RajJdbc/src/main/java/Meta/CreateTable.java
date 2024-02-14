package Meta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Facebook","root","root");
		Statement st = con.createStatement();
		st.execute("Create table SignUp(FirstName varchar(30),LastName varchar(10),Email_Id varchar(30),Phone_No long,Password varchar(16))");
		
		System.out.println("Table Created");
		
		con.close();
	}

}

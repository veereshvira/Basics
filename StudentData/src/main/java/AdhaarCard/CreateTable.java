package AdhaarCard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Adhaar_Card","root","root");
		Statement st= con.createStatement();
		st.execute("Create table adhaarcard_generate(SrNo integer,name varchar(20),AdhaarNumber long)");
		
		System.out.println("Adhaar_card Generated successfully to the Database");
		
		con.close();
	}
}

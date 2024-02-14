package StudentDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentData","root","root");
		Statement st = con.createStatement();
		st.execute("Create table School(Id integer, Name varchar(20),Pho_no long)");
		
		System.out.println("Table Created");
		
		con.close();
	}
}

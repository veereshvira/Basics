 package jehm28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm28","root","root");
		Statement st = con.createStatement();
		st.execute("Create table jspraj(Id integer, Name varchar(20),Pho_no long,Email_id varchar(20))");
		
		System.out.println("Table Created");
		
		con.close();
	}
}


package jehm28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertintoTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm28","root","root");
		Statement st = con.createStatement();
		st.execute("insert into jspraj values(10,'Suhas',55856656,'suhus@gmail.com')");
		st.execute("insert into jspraj values(20,'Wasim',59995895,'wasim@gmail.com')");
		System.out.println("Inserted");
		
		con.close();
	}
}

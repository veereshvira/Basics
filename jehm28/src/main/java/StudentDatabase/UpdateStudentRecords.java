package StudentDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudentRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","root");
		Statement st= con.createStatement();
		st.execute("Update school set pho_no=8088394344 where id=4");
		
		System.out.println("School records updated successfully");
		
		con.close();
	}
}

package Mobile;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MoblieDetails {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement st = con.createStatement();
		st.execute("Create table Mobiledata(Id integer, Name varchar(20),IMEI long,Specification varchar(20))");
		
		System.out.println("Table Created");
		
		con.close();
	}
}

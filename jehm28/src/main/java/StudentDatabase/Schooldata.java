package StudentDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Schooldata {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","root");
		Statement st = con.createStatement();
		st.execute("insert into school values(1,'VijayKrishna',8762230490)");
		st.execute("insert into school values(2,'Nikhil',8792456877)");
		st.execute("insert into school values(3,'Shoaib',8088089369)");
		st.execute("insert into school values(4,'kowshik',8795588550)");
		
		System.out.println("Values inserted successfully");
		
		con.close();
	}
	}


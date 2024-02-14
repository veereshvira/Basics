package Meta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTab {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","root");
		Statement st = con.createStatement();
		st.execute("Create table cricket(id integer,name varchar(30),age integer,email_Id varchar(30))");
		System.out.println("Table Created");
		
		con.close();

	}

}

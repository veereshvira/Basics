package AdhaarCard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertintoTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adhaar_card","root","root");
		Statement st = con.createStatement();
//		st.execute("insert into adhaarcard_generate values(01,'Mrinal',245928137632)");
		st.execute("insert into adhaarcard_generate values(02,'Santhosh',245928547632)");
		st.execute("insert into adhaarcard_generate values(03,'abhinav',786258632159)");
		st.execute("insert into adhaarcard_generate values(04,'Jaysurya',781149418544)");
		System.out.println("Inserted successfully");
		
		con.close();
	}
}

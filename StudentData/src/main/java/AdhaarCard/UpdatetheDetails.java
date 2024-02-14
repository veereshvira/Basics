package AdhaarCard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatetheDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adhaar_card","root","root");
		Statement st = con.createStatement();
		st.execute("Update adhaarcard_generate set AdhaarNumber=245896781338 where SrNo=4");
		
		System.out.println("Adhaarcard Details Updated Successfully");
		
		con.close();
	}

}

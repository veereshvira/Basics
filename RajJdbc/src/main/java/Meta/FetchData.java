package Meta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Facebook","root","root");
		PreparedStatement ps = con.prepareStatement("select FirstName,LastName,Email_Id,Password from signup where Phone_No=?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone_No");
		Long Phone_No = sc.nextLong();
		ps.setLong(1, Phone_No);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println("Phone_No:"+rs.getLong(1)+"\nFirstName:"+rs.getString(2)+"\nLastName:"+rs.getString(3)+"\nEmail_Id:"+rs.getString(4)+"\nPassword:"+rs.getString(5));
		}
	}
}

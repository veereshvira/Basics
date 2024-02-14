package Meta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTheRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","root");
		Statement st = con.createStatement();
		PreparedStatement ps =con.prepareStatement("delete from signup where Phone_No=?");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name");
		long Phone_No=sc.nextLong();
		ps.setLong(1,Phone_No);
		ps.execute();
		
		
		System.out.println("Records deleted successfully");
		
	}
}

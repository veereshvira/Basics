package Meta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTheValues {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Facebook","root","root");
		PreparedStatement ps = con.prepareStatement("insert into signup values(?,?,?,?,?)");

		Scanner sc = new Scanner(System.in);
		int Choice=sc.nextInt();
		switch (Choice) {
		case 1:while(true) {

			System.out.println("Enter First_Name");
			String fn = sc.next();

			System.out.println("Enter Last_Name");
			String ln = sc.next();

			System.out.println("Enter Email_Id");
			String em = sc.next();

			System.out.println("Enter Phone_No");
			long ph = sc.nextLong();

			System.out.println("Enter Password");
			String pw = sc.next();

			ps.setString(1, fn);
			ps.setString(2, ln);
			ps.setString(3, em);
			ps.setLong(4, ph);
			ps.setString(5, pw);

			ps.execute();

			System.out.println("==========================");
			System.out.println("Data Inserted Successfully");

			System.out.println("Continue Inserting (Or) For Exit Press -> 0 ");
			
		}
		
		
		
		default:System.out.println("Exited");
			System.exit(0);
			con.close();
		}



	}
}

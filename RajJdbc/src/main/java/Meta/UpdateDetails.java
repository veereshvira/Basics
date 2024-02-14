package Meta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDetails {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Facebook","root","root");
		PreparedStatement ps = con.prepareStatement("Update signup set Phone_No=? where FirstName='naman'");

		Scanner sc = new Scanner(System.in);

			System.out.println("Enter Phone_No");
			long ph = sc.nextLong();


			ps.setLong(1, ph);

			ps.execute();

			System.out.println("==========================");
			System.out.println("Data Inserted Successfully");

			
		}
			
	}

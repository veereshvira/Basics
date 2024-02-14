package st;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) {
		try {
			//1.Load and Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.Establish Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","root");
			
			//3.Create Statement
			Statement st = con.createStatement();
			
			//4.Execute Query/Statement
			st.execute("Insert into st values(3, 'Tom89',8895664899)");

			
			//5.Close Connection
			con.close();
			
			System.out.println("Data Saved");
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}


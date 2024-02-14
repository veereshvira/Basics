package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {
	public static void main(String[] args) throws Exception
	{
			String url = "jdbc:mysql://localhost:3306/employee";
			String username = "root";
			String pass = "root";
			String query = "Select name from employee where id=1";
			
			Class.forName("com.jdbc.mysql.Driver");
			Connection con = DriverManager.getConnection(url,username,pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			rs.next();
			
		
			String name = rs.getString("name");
			
			System.out.println(name);
			
			st.close();
			con.close();

	}
}






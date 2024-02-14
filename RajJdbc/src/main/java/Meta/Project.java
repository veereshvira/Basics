package Meta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Project {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Scanner scn= new Scanner(System.in);
		
		
		boolean b=true;
		while(b){
			System.out.println("\nEnter The Choice \n1. Insert \n2. Update \n3. Delete \n4. Recieve based on ID \n5. Retrieve \n6. Exit"); 

			int a =scn.nextInt(); 
			switch(a){
			case 1 :{
				PreparedStatement preparedStatement=con.prepareStatement("insert into cricket values(?,?,?,?)"); 

				System.out.println("enter your id");
				Scanner scn1= new Scanner(System.in);
				int i= scn1.nextInt(); 

				System.out.println("enter your name");
				String s=scn1.next();

				System.out.println("enter your age");
				int f=scn1.nextInt(); 

				System.out.println("enter your email");
				String d= scn1.next();

				preparedStatement.setInt(1, i); 
				preparedStatement.setString(2, s);
				preparedStatement.setInt(3, f);
				preparedStatement.setString(4, d);

				preparedStatement.execute();

				System.out.println("Succefully saved");
			}
			break;

			case 2:{
				System.out.println("enter id which is to be updated");

				PreparedStatement preparedStatement=con.prepareStatement("Update cricket set name=? where id=?");

				System.out.println("enter id");
				Scanner scn1= new Scanner(System.in);

				int i =scn1.nextInt(); 
				System.out.println("enter your name");

				String s =scn1.next();
				preparedStatement.setInt(1,i);
				preparedStatement.setString(2, s); 

				preparedStatement.execute();
				System.out.println("done");
			}
			break;

			case 3 :{
				System.out.println("enter id to delete from table");
				PreparedStatement preparedStatement =con.prepareStatement("delete from cricket where id=?");

				int i=scn.nextInt();
				preparedStatement.setInt(1,i);

				preparedStatement.execute();

				System.out.println("successfully saved");
			}
			break;

			case 4:{
				System.out.println("enter id to fetch details");
				PreparedStatement preparedStatement=con.prepareStatement("select from cricket where id=?");

				int i=scn.nextInt();
				preparedStatement.setInt(1,i);
				ResultSet resultset=preparedStatement.executeQuery();
				while(resultset.next()){
					System.out.println(resultset.getInt(1));
					System.out.println(resultset.getString(2)); 
					System.out.println(resultset.getInt(3));
					System.out.println(resultset.getString(4));
				}
				break;
			}
			case 5: {
				System.out.println("To Retrieve");
				PreparedStatement preparedStatement=con.prepareStatement ("select * from cricket"); 
				ResultSet resultSet=preparedStatement.executeQuery();

				while(resultSet.next()){
					System.out.println(resultSet.getInt(1)); 
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getInt(3));
					System.out.println(resultSet.getString(4));
				}
				break;
			}
			case 6:{
				System.out.println("THANK YOU");
				b=false;
			}
			}
			}
			con.close();
		}
}


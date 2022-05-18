package com.tvf.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect1 {

	public static void main(String[] args) {
		String dbDriver= "com.mysql.cj.jdbc.Driver";
		String dbURL= "jdbc://127.0.0.1:3306/CG1";
		String dbusername= "root";
		String dbpassword= "Vinay@1210";
		String query="SELECT * FROM Employee12";
		try
		{
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			Connection con=DriverManager.getConnection(dbURL, dbusername, dbpassword);
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(query);
			while(r.next())
			{
				String EmployeesData="";
				for(int i=1;i<=3;i++)
				{
					EmployeesData=EmployeesData+" "+r.getString(i);
				}
				System.out.println(EmployeesData);
			}
	
	
			
		}
		catch(SQLException e)
		{
			System.out.println("Invalid Username and password");
		}
	}
}
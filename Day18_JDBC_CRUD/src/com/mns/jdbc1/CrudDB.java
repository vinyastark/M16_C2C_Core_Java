package com.mns.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CrudDB {
	
	public static void main(String[] args) {
		
		String dbURL="jdbc:mysql://127.0.0.1:3306/CG1";
		String dbusername="root";
		String dbpassword="Vinay@1210";
		
		try
		{
			Connection con=DriverManager.getConnection(dbURL, dbusername, dbpassword);
			String sql="Select *from Employee22";
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(sql);
			int count=1;
			while(r.next())
			{
				
				String name=r.getString(2);
				String password1=r.getString(3);
				String email1=r.getString(4);
				String result =" USER: %d %s %s %s";
				System.out.println(String.format(result,count++,name,password1,email1));
			}
				con.close();
		
		
			/*Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="DELETE FROM Employee22 WHERE User_ID=1";
			PreparedStatement s=con.prepareStatement(sql);
			int rows=s.executeUpdate();
			
			if(rows>0)
			{
				System.out.println("A new User information deleted successfully");
			}
			con.close();*/
			
			
		
			/*Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="Select *from Employee22";
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(sql);
			int count=1;
			while(r.next())
			{
				
				String name=r.getString(2);
				String password1=r.getString(3);
				String email1=r.getString(4);
				String result =" USER: %d %s %s %s";
				System.out.println(String.format(result,count++,name,password1,email1));
			}
			con.close();*/
			
		
			
			/*Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="UPDATE Employee22 SET User_Name=?,User_Password=? WHERE User_ID=1";
			PreparedStatement s=con.prepareStatement(sql);
			
			s.setString(1, "Vinay12");
			s.setString(2, "Pass@1224");
			
			
			
			
			int rows=s.executeUpdate();
		
			if(rows>0)
			{
				System.out.println("A new User information entered successfully");
			}
			con.close();*/
			
			/*String sql="Select *from Employee22";
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(sql);
			int count=1;
			while(r.next())
			{
				
				String name=r.getString(2);
				String password1=r.getString(3);
				String email1=r.getString(4);
				String result =" USER: %d %s %s %s";
				System.out.println(String.format(result,count++,name,password1,email1));
			}
			con.close();*/
		
			
		
		/*String sql="INSERT INTO Employee22(User_Name,User_Password,Email )values(?,?,?)";
			PreparedStatement s=con.prepareStatement(sql);
			
			
			s.setString(1, "Vinay@15");
			s.setString(2, "Pass@121524 ");
			s.setString(3, "vinayjoshi995@gmail.com");
			
			
			int rows=s.executeUpdate();
		
			if(rows>0)
			{
				System.out.println("A new User information entered successfully");
			}
			con.close();*/
		}
		
		catch(SQLException e)
		{
			System.out.println("Exception occurred "+e);
		}

}

		
		
		
		
		
	}
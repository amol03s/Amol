package com.training.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestConnection {
	public static void main(String[] args){
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://192.168.10.71:3307/dac13";
				Connection conn=DriverManager.getConnection(url,"dac13","welcome");
				if(conn != null)
				{
					System.out.println("Connection Done");
				}
				else
				{
					System.out.println("Connection not  Done");
					
				}
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery("Select * from users");
				while(rs.next())
				{
					System.out.println("ID:"+rs.getInt(1));
					System.out.println("Name :"+rs.getString(2));
					System.out.println("Password :"+rs.getString(3));
					System.out.println("Role :"+rs.getString(4));
				}
				rs.beforeFirst();
				System.out.println("Enter the role");
				Scanner sc=new Scanner(System.in);
				String rl=sc.next();
				Statement st1=conn.createStatement();
				ResultSet rs1=st1.executeQuery("select * from users where role= '"+rl+"'");
				while(rs1.next()) {
					System.out.println("Id:"+rs1.getInt(1));
					System.out.println("Name :"+rs1.getString(2));
					System.out.println("Password :"+rs1.getString(3));
					System.out.println("Role :"+rs1.getString(4));
				
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

	}

}

package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class MyConnection{

	public static Connection conn=null;
	
	public  static Connection  getMyconnection() {
		if(conn == null)
		{
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://127.0.0.1:3306/user01";
				conn=DriverManager.getConnection(url,"root","root123");
				System.out.println("Connection SuccessFully");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	
			
		}
		return conn;
		
		
	}
	
	public static void closeMyconnection() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}

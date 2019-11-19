package com.training.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	public static Connection conn=null; 
	public static Connection getMyConnection(){
		if(conn==null){
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			   String url ="jdbc:mysql://127.0.0.1:3306/user01";
				// String url="jdbc:mysql://192.168.10.71:3307/dac13";
			    conn=DriverManager.getConnection(url,"root","root123");
			    System.out.println("Connection Done Succesfully");
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
}
	public static void closeMyConnection(){
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

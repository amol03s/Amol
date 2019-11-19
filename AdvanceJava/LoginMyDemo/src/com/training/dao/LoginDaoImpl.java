package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.training.beans.MyUser;

public class LoginDaoImpl implements LoginDao {
	static Connection conn=null;
	static PreparedStatement psvalid=null;
	static {
		
		try {
			conn=MyConnection.getMyConnection();
			psvalid=conn.prepareStatement("select * from users where name=? and password=?");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public MyUser validateUser(String u, String p)
	{
		
		try {
			psvalid.setString(1, u);
			psvalid.setString(2, p);
			ResultSet rs=psvalid.executeQuery();
			if(rs.next()) {
				MyUser u1=new MyUser(rs.getString(2),rs.getString(3));
				System.out.println("in validateuser"+u1);
				return u1;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

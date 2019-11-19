package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.training.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static  Connection conn =null;
	static PreparedStatement psins=null;
	static {
		conn = MyConnection.getMyconnection();
		try {
			psins=conn.prepareStatement("insert into user1 values(?,?)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int insertData(Employee e) {
		try {
			psins.setInt(1,e.getId());
			psins.setString(2,e.getName());
			return psins.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}	
		return 0;
	}
}

package com.training.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.training.beans.MyUser;

public class UserDaoImpl implements UserDao {
    static Connection conn=null;
    static PreparedStatement psIns=null;
    static PreparedStatement psgetbyid=null;
    static PreparedStatement psupdate=null;
    static PreparedStatement psdelete=null;
    static {
    	try {
    	    conn=MyConnection.getMyConnection();
    		psIns=conn.prepareStatement("insert into users values(?,?,?,?)");
    		psgetbyid=conn.prepareStatement("select * from users where id=?");
    		psupdate=conn.prepareStatement("update users set name=?,password=?,role=? where id=?");
    		psdelete=conn.prepareStatement("delete from users where id=?");
		}catch (SQLException e) {
			e.printStackTrace();
		}
    }
	@Override
	public int insertData(MyUser u) {
		try {
			psIns.setInt(1,u.getId());
			psIns.setString(2, u.getNm());
			psIns.setString(3, u.getPs());
			psIns.setString(4, u.getRole());
			//System.out.println("In insertData"+psIns.executeUpdate());
			return psIns.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		return 0;
	}
	@Override
	public MyUser getUserById(int id) {
		try {
			psgetbyid.setInt(1,id);
		    ResultSet rs;
		 	rs = psgetbyid.executeQuery();
			if(rs.next()) {
				return new MyUser(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;          
	}
	@Override
	public int updateData(MyUser ob) {
		
		try {
			psupdate.setString(1,ob.getNm());
			psupdate.setString(2,ob.getPs());
			psupdate.setString(3,ob.getRole());
			psupdate.setInt(4,ob.getId());
			return psupdate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleterecordbyid(int id)
	{ 	
		try {
				psdelete.setInt(1,id);	
				return psdelete.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;

	}
	@Override
	public void closeConnection() {
		MyConnection.closeMyConnection();
		
	}
	

}

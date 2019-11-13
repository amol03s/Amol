package com.training.dao;

import java.util.List;

import com.training.beans.MyUser;

public interface UserDao {
	int insertData(MyUser u);
	MyUser getUserById(int id);
	int updateData(MyUser ob);
	void closeConnection();
   int 	deleterecordbyid(int id);
   List<MyUser> displayalluser();
   int updatepassword(int id,String ps);

}

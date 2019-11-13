package com.training.service;

import java.util.List;

import com.training.beans.MyUser;

public interface UserService {
     int addNewRecord();
    MyUser getById(int id);
	int updateRecord(int id);
	void closeConnection();
	int deleterecord(int id);
	List<MyUser> displayAlluser();
	int updatepassword(int id,String ps);
}

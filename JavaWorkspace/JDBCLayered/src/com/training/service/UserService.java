package com.training.service;

import com.training.beans.MyUser;

public interface UserService {
     int addNewRecord();
    MyUser getById(int id);
	int updateRecord(int id);
	void closeConnection();
	int deleterecord(int id);
}

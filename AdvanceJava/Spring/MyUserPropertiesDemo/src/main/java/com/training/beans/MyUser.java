package com.training.beans;

public class MyUser {
private String UserName,Password;

public MyUser() {
	super();
	System.out.println("In default contrucotr");
}

public MyUser(String userName, String password) {
	super();
	UserName = userName;
	Password = password;
	System.out.println("In parametrised contrucotr");
}

public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
	System.out.println("In setUserName method");
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

@Override
public String toString() {
	return "MyUser [UserName=" + UserName + ", Password=" + Password + "]";
}
	
	
}

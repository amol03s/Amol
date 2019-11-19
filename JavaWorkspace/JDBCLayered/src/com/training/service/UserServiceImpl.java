package com.training.service;
import java.util.List;
import java.util.Scanner;
import com.training.beans.MyUser;
import com.training.dao.UserDao;
import com.training.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao udao;
    
	public UserServiceImpl(){
		super();
		this.udao = new UserDaoImpl();
	}
	
	@Override
	public int addNewRecord(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Id");
		int id=sc.nextInt();
		System.out.println("enter Name");
		String nm=sc.next();
		System.out.println("enter Password");
		String ps=sc.next();
		System.out.println("enter role");
		String rl=sc.next();
		MyUser ob=new MyUser(id,nm,ps,rl);
		return udao.insertData(ob);
	}

	@Override
	public int updateRecord(int id) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Name");
		String nm=sc.next();
		System.out.println("enter Password");
		String ps=sc.next();
		System.out.println("enter role");
		String rl=sc.next();
		MyUser ob=new MyUser(id,nm,ps,rl);	
		return udao.updateData(ob);
	}
   
	
	@Override
	public MyUser getById(int id) {
		return udao.getUserById(id);
		
	}

	@Override
	public void closeConnection() {
		udao.closeConnection();
		
	}
	public int deleterecord(int id)
	{
		return udao.deleterecordbyid(id);
	}
	public List<MyUser> displayAlluser()
	{
		return udao.displayalluser();
	}
   	public int updatepassword(int id,String ps)
	{
		return udao.updatepassword(id,ps);
	}
	
}

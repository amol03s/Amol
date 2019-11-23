package com.training.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.beans.Auther;
import com.training.beans.MyBook;

public class MyDoaImpl implements MyDao {
	static SessionFactory sf=null;
	static {
		sf=Hibernateutil.getMysessionfactory();
	}
	
	public boolean	addBook(List<MyBook> blist)
	{
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		for(MyBook i:blist)
		{
			s.save(i);
	
		}
		tr.commit();
		return true;
	}
	public MyBook getMyBookbyid(String id)
	{
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		MyBook u=(MyBook) s.get(MyBook.class,new String(id));
		return u;
	}

}

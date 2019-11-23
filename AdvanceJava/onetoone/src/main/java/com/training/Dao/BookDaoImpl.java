package com.training.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.beans.MyBook;

public class BookDaoImpl implements BookDao{
	private static SessionFactory sf=null;
	private static Session s=null;
	private static Transaction tr=null;
	
	static {
		sf=Hibernateutil.getMySessionFactory();
		s=sf.openSession();
		tr=s.beginTransaction();
	}

	
	public boolean addMyBook(List<MyBook> blist) {
		for(MyBook b:blist)
		{
			s.save(b);
		}
		tr.commit();
		return true;
	}

}

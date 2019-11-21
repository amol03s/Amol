package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Book;

public class BookDaoImpl implements BookDao{
	private static SessionFactory sf=null;
	private static Session s=null;
	private static Transaction tr=null;
	
	static {
		sf=HibernateUtil.getMySessionFactory();
		s=sf.openSession();
		tr=s.beginTransaction();
	}

	@Override
	public boolean addBook(List<Book> blist) {
		for(Book b:blist)
		{
			s.save(b);
			
		}
		tr.commit();
		return true;
	}

}

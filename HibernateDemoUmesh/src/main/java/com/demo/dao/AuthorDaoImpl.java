package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Author;

public class AuthorDaoImpl implements AuthorDao{
	private static SessionFactory sf=null;
	private static Session s=null;
	private static Transaction tr=null;
	
	static {
		sf=HibernateUtil.getMySessionFactory();
		s=sf.openSession();
		tr=s.beginTransaction();
	}

	@Override
	public boolean addAuthor(Author a) {
		s.save(a);
		tr.commit();
		return true;
	}
	
}

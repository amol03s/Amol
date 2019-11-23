package com.training.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.beans.Auther;

public class AutherDaoImpl implements AutherDao {
      static SessionFactory sf=null;
      static
      {
    	  
    	  sf=Hibernateutil.getMySessionFactory();
      }
	
	   
	@Override
	public boolean addAuther(Auther a) 
	{
       Session s=sf.openSession();
       Transaction tr=s.beginTransaction();
       s.save(a);
       tr.commit();
		return true;
	}

}

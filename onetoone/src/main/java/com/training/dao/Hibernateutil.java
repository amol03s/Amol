package com.training.dao;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
	
	static SessionFactory sf=null;
   public static SessionFactory getMysessionfactory() {
	if(sf==null)
	{
		sf = new Configuration().configure().buildSessionFactory();
	}
	return sf;
	}
   public static void closeconnection()
   {
	   if(sf!=null)
	   {
		  sf.close(); 
		   
	   }
	   
   }
}

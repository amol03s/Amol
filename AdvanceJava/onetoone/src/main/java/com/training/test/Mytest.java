package com.training.test;

import java.util.ArrayList;
import java.util.List;

import com.training.beans.Auther;
import com.training.beans.MyBook;
import com.training.service.Autherservice;
import com.training.service.AutherserviceImpl;
import com.training.service.Bookservice;
import com.training.service.BookserviceImpl;

public class Mytest {

	public static void main(String[] args) {
		
		Auther a=new Auther(2,"atul","1234");
		MyBook ob=new MyBook("1","java","1200","400",a);
		
		List<MyBook> blist= new ArrayList<MyBook>();
		blist.add(ob);
		Autherservice as=new AutherserviceImpl();
		Bookservice bs=new BookserviceImpl();
		boolean v=as.addAuther(a);
		boolean u=bs.addMyBook(blist);
		  if(v)
				        {
				        	System.out.println("Inserted suvccessfully");
				        	
				        }
				        else
				        {
				        	
				        	System.out.println(" not Inserted suvccessfully");
				        	
				        }
		
          if(u)
			        {
			        	System.out.println("Inserted suvccessfully");
			        	
			        }
			        else
			        {
			        	
			        	System.out.println(" not Inserted suvccessfully");
			        	
			        }
	}

}

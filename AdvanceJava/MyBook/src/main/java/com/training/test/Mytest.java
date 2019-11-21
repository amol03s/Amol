package com.training.test;

import java.util.ArrayList;
import java.util.List;

import com.training.beans.MyBook;
import com.training.service.BookService;
import com.training.service.BookServiceImpl;

public class Mytest {

	public static void main(String[] args) {
		
		MyBook ob=new MyBook(1,"shala",1200.0,200);
		MyBook ob1=new MyBook(2,"bhagvat",1400.0,400);
		List<MyBook> blist=new ArrayList<MyBook>();
		
		blist.add(ob);
		blist.add(ob1);
		
		BookService bs=new BookServiceImpl();
		boolean u=bs.addBook(blist);
		System.out.println(u);
		if(u)
		{
        	System.out.println("inserted succcessully" +u);
			
		}
		else
		{
			System.out.println("Not inserted successfully");
		
		}
	}
}

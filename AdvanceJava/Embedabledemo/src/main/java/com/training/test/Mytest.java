package com.training.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.beans.Auther;
import com.training.beans.MyBook;
import com.training.service.BookService;
import com.training.service.BookServiceImpl;

public class Mytest {

	public static void main(String[] args) {
		Auther u=new Auther(12,"amol","12334");
		
		MyBook ob=new MyBook("1","shala",1400.0,400,u);
		
		MyBook ob1=new MyBook("2","bhagvat",1400.0,400,u);
		
		List<MyBook> blist=new ArrayList<MyBook>();
		
		blist.add(ob);
		blist.add(ob1);
		
		BookService bs=new BookServiceImpl();
		boolean r=bs.addBook(blist);
		System.out.println(u);
		if(r)
		{
        	System.out.println("inserted succcessully" +r);
			
		}
		else
		{
			System.out.println("Not inserted successfully");
		
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book id");
		String id=sc.next();
		/*MyBook b=bs.getMyBookbyid(id);
		if(b!=null)
		{
			System.out.println("id is found");
			
		}
		else
		{
			System.out.println("id is not found");
			
		}*/
	}
}

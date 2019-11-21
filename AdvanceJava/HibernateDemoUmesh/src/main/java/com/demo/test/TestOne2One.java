package com.demo.test;


import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Author;
import com.demo.beans.Book;
import com.demo.service.AuthorService;
import com.demo.service.AuthorServiceImpl;
import com.demo.service.BookService;
import com.demo.service.BookServiceImpl;

public class TestOne2One {
	
	public static void main(String [] args)
	{
		List<Book> blist= new ArrayList<>();
		Author a=new Author(101,"Gnapat","9015161615");
		Book bk=new Book(201, "Amche amhich ",5000, 300, a);
		blist.add(bk);
		
		AuthorService as=new AuthorServiceImpl();
		BookService bs=new BookServiceImpl();
		boolean ans=as.addAuthor(a);
		boolean ans1=bs.addBook(blist);
		if(ans)
		{
			System.out.println("Author inserted successfully");
			
		}
		else
		{
			System.out.println("author insertion failed");
		}
		
		if(ans1)
		{
			System.out.println("Author inserted successfully");
			
		}
		else
		{
			System.out.println("author insertion failed");
		}
	}

}
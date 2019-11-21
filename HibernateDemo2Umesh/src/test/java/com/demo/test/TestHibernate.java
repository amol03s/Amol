package com.demo.test;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Author;
import com.demo.beans.Book;
import com.demo.service.BookService;
import com.demo.service.BookServiceImpl;

public class TestHibernate {

	public static void main(String[] args) {
		Author auth=new Author(1,"ganpat","9060121215");
		List<Book> blist=new ArrayList<>();
		Book bk1=new Book(1,200, 100,"any", auth);
		Book bk2=new Book(2,300, 500,"tumhi tumch bgha", auth);
		blist.add(bk1);
		blist.add(bk2);
		BookService bs=new BookServiceImpl();
		boolean ans=bs.addBook(blist);
		if(ans)
		{
			System.out.println("created successfully");
		}else
		{
			System.out.println("created faliled");
		}

	}

}

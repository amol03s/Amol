package com.training.service;

import java.util.HashSet;
import java.util.Scanner;

import com.training.beans.Auther;
import com.training.beans.MyBook;
import com.training.dao.BookDao;
import com.training.dao.BookDaoImpl;

public class BookserviceImpl implements Bookservice{

	private BookDao bdao;
	
	  
	public BookserviceImpl() {
		super();
		this.bdao = new BookDaoImpl();
	}


	public boolean addBook(HashSet<MyBook> book) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the book id");
		int id=sc.nextInt();
		System.out.println("Enter the book name");
		String nm=sc.next();
		System.out.println("Enter the book pages");
		String pg=sc.next();
		MyBook b=new MyBook(id,nm,pg);
		
		
		System.out.println("Enter the Auther id");
		int id1=sc.nextInt();
		System.out.println("Enter the Auther name");
		String nm1=sc.next();
		System.out.println("Enter the book prize");
	 String pr1=sc.nextDouble();
		Auther a=new Auther(id,nm,pg,(MyBook)b);
		
		
		
		return bdao.addBook();
	}

}

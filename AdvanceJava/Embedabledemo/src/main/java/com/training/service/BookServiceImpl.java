package com.training.service;

import java.util.List;

import com.training.beans.MyBook;
import com.training.dao.MyDao;
import com.training.dao.MyDoaImpl;

public class BookServiceImpl implements BookService{
	private MyDao bdao;
	
	public BookServiceImpl() {
		super();
		this.bdao = new MyDoaImpl();
	}

	
	public boolean addBook(List<MyBook> blist)
	{
		return bdao.addBook( blist);
		
		
	}
	public MyBook	getMyBookbyid(String id)
	 {
		 
		 return bdao.getMyBookbyid(id);
	 }

}

package com.demo.service;

import java.util.List;

import com.demo.beans.Book;
import com.demo.dao.BookDao;
import com.demo.dao.BookDaoImpl;

public class BookServiceImpl implements BookService{
	BookDao bdao=new BookDaoImpl();
	@Override
	public boolean addBook(List<Book> blist) {
		
		return bdao.addBook(blist);
	}

}

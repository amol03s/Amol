package com.demo.service;

import java.util.List;

import com.demo.beans.Book;
import com.demo.dao.BookDao;
import com.demo.dao.BookDaoImpl;

public class BookServiceImpl implements BookService {
	private BookDao bdao=null;
	
	public BookServiceImpl() {
	
		this.bdao = new BookDaoImpl();
	}

	@Override
	public boolean addBook(List<Book> blist) {
			return bdao.createBook(blist);
	}

}

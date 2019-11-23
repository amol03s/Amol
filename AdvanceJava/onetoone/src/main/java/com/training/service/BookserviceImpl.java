package com.training.service;

import java.util.List;

import com.training.Dao.BookDao;
import com.training.Dao.BookDaoImpl;
import com.training.beans.MyBook;

public class BookserviceImpl implements Bookservice {
	
	private BookDao bdao;

	public BookserviceImpl() {
		super();
		this.bdao = new BookDaoImpl();
	}

	public boolean addMyBook(List<MyBook> blist) {
		// TODO Auto-generated method stub
		return bdao.addMyBook(blist);
	}

}

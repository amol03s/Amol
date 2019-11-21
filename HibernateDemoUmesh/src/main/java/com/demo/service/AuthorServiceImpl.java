package com.demo.service;

import com.demo.beans.Author;
import com.demo.dao.AuthorDao;
import com.demo.dao.AuthorDaoImpl;

public class AuthorServiceImpl implements AuthorService {
	private AuthorDao ad=null;

	public AuthorServiceImpl() {
	
		this.ad = new AuthorDaoImpl();
	}
	public boolean addAuthor(Author a) {
		
		return ad.addAuthor(a);
		
	}

	

}

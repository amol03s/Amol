package com.demo.dao;

import java.util.List;

import com.demo.beans.Book;

public interface BookDao {

	public boolean createBook(List<Book> blist);

}

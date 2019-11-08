package com.training.service;
import java.util.List;
import java.util.Map;

import com.training.beans.Book;
public interface BookService {
	 void AddNewBook( Map<String,Book> tm); /*by default public*/
	 int searchbookbyid(Map<String,Book> tm,int id);
	 Book searchbookbyName(Map<String,Book> tm,String BkNm);
	 Book DeleteBook(Map<String,Book> tm,int id);
	 boolean ModifyBk(Map<String,Book> tm,int id);
}

package com.training.service;
import java.util.List;
import com.training.beans.Book;
public interface BookService {
	 void AddNewBook( List<Book> bList); /*by default public*/
	 int searchbookbyid(List<Book>bList,int id);
	 Book searchbookbyName(List<Book>bList,String BkNm);
	 Book DeleteBook(List<Book>bList,int id);
	 boolean ModifyBk(List<Book> bList,int id);
}

package com.training.service;
import java.util.List;
import java.util.Scanner;

import com.training.beans.Book;

public class BookServiceImpl implements BookService{
	Scanner sc =new Scanner(System.in);
	public void AddNewBook( List<Book> bList) {
		
		System.out.println("Enter the BkId");
		int Bkid=sc.nextInt();
		System.out.println("Enter the BkName");
		String BkNm=sc.next();
		System.out.println("Enter the BAtName");
		String BANm=sc.nextLine();
		String BAtNm=sc.nextLine();
		
		Book bk =new Book(Bkid,BkNm,BAtNm);
		bList.add(bk);  /*Add the bk object into ArrayList*/
	}
	public int searchbookbyid(List<Book>bList,int id)
	{
		Book bk=new Book(id);
		int pos=bList.indexOf(bk);
		return pos;
		
    }
	
	public Book  searchbookbyName(List<Book>bList,String BkNm){
		for(Book x: bList){
			if(x.getName().equals(BkNm)){
			    return x;
			}
		}
		return null;
	}
	
	public Book DeleteBook(List<Book>bList,int id) {
		
		Book bk=new Book(id);
		int pos=searchbookbyid(bList,id);
		bList.remove(bk);
        return bk;

	}
	public boolean ModifyBk(List<Book> bList,int id){
		int pos=searchbookbyid(bList,id);
		if(pos!=-1){
			
			System.out.println("Enter the Book Name");
			String bkNm=sc.next();
			Book bk=bList.get(pos);
			bk.setBookName(bkNm);
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

package com.training.test;

import java.util.HashSet;
import java.util.Scanner;

import com.training.beans.MyBook;
import com.training.service.Bookservice;
import com.training.service.BookserviceImpl;

public class TestBook {

	public static void main(String[] args) {
         int choice;
         Bookservice bs=new BookserviceImpl();
         HashSet<MyBook> Book=new HashSet<MyBook>();
         do {
		System.out.println("1.Add Book\n 2.Delete Book\n 3.Read all \n 4.getBookbyid\n 5.Exit");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the choice");
		 choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			boolean u=bs.addBook(Book);
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;
		case 4:
			
			break;
			
		case 5:
			
			break;
			
		case 6:
			
			sc.close();
			 System.exit(0);
			break;
		
		
		
		
		}
		
         }while(choice!=6);
	}

}

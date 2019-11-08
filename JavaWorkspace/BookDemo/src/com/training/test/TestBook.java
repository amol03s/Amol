package com.training.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.training.beans.Book;
import com.training.service.BookService;
import com.training.service.BookServiceImpl;

public class TestBook {
	public static void main(String[] args) {
	   List<Book> bList = new ArrayList<>();
	   BookService bs = new BookServiceImpl();
	   int ch;
	   Scanner sc =new Scanner(System.in);
	  do {
	   System.out.print("1.AddNewBook \n"+"2.DeleteBook \n"+"3.SearchBkById\n"
	  + "4.SearchBkName \n"+"5.ModifyBk\n"+"6.DisplayById\n"+"7.DisplayByName\n"+"8.DisplayAll\n"+"9.Exit\n");
	   System.out.println("Enter your choice");
	   ch=sc.nextInt();
	   switch(ch) {
	   case 1:
		   		bs.AddNewBook(bList);
		   		break;
	   case 2:
		    System.out.println("Enter the id");
		    int id=sc.nextInt();
		      Book bk= bs.DeleteBook(bList,id);
		      if(bk!=null)
		      {
		    	   System.out.println("the book is deleted"+bk);
		      }
		      else
		      {
		    	  System.out.println("the book is not found");
		    	  
		    	  
		      }
		   
		   break;
	   case 3:
		   System.out.println("Enter the bkid");
		   id=sc.nextInt();
		  int pos=bs.searchbookbyid(bList,id);
		   if(pos!=-1)
		   {
			   System.out.println("book is found"+pos+bList.get(pos));
		   }
		   else 
		   {
			   System.out.println("book is not found");  
		   }
		   break;
	   case 4:
		   System.out.println("Enter the BkName");
		   String BkNm=sc.next();
		   Book x =bs.searchbookbyName(bList,BkNm);
		   if(x!=null)
		   {
			   System.out.println(x);
		   }
		   else 
		   {
			   System.out.println("book is not found");  
		   }
		   break;
	   case 5:
		   System.out.println("Enter the bkid");
		    id=sc.nextInt();
		   boolean t =bs.ModifyBk(bList,id);
	   		if(t)
	   		{
	   			System.out.println("Modify Succesfully");
	   		}
	   		else
	   		{
	   			System.out.println("UnSuccesfully");
	   		}
		   break;
	   case 6:
		   System.out.println("Enter the bkid");
		    id=sc.nextInt();
		   pos=bs.searchbookbyid(bList,id);
		   if(pos!=-1)
		   {
			   System.out.println("book is found"+pos+bList.get(pos));
		   }
		   else 
		   {
			   System.out.println("book is not found");  
		   }
		   break;
	   case 7:
		   System.out.println("Enter the BkName");
		   BkNm=sc.next();
		   x =bs.searchbookbyName(bList,BkNm);
		   if(x!=null)
		   {
			   System.out.println(x);
		   }
		   else 
		   {
			   System.out.println("book is not found");  
		   }
		   break;
	   case 8:
		    System.out.println(bList);
		   break;
	   case 9:System.exit(0);
		   break;
	   default:System.out.println("Wrong choice");
		   break;
	   }
	  }while(ch!=9);
	}

}

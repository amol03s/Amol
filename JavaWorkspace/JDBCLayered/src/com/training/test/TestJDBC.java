package com.training.test;
import java.util.List;
import java.util.Scanner;
import com.training.beans.MyUser;
import com.training.service.UserService;
import com.training.service.UserServiceImpl;

public class TestJDBC {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int choice=0;
		UserService us=new UserServiceImpl();
		do {
		System.out.println("1.Add new Record\n 2.Update Record \n 3.Delete Record \n  4.Displayallusers \n 5.UpdatePassword \n 6.Exit\n");
		System.out.println("choice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
		      int n=us.addNewRecord();
		      if(n>0) {
		    	  System.out.println("Insertion done");
		      }
		      else {
		    	  System.out.println("Insertion not done"); 
		      }
		      break;
		case 2:
			  System.out.println("enter id");
			  int id=sc.nextInt();
			  MyUser u=us.getById(id);
			  if(u!=null) {
			      System.out.println(u);
			      System.out.println("do you want to update?");
			      String ans=sc.next();
			      if(ans.equals("y")) {
			          n=us.updateRecord(id);
			          if(n>0)
			          {
			    	      System.out.println("updation done");
			          }
			          else {
			    	     System.out.println("updation not done"); 
			          }
			      } 
			  }else {
				  System.out.println("id not found");
			  }
			  
			   break;
			   
		case 3:
				
				id =sc.nextInt();
				 u=us.getById(id);
				 if(u!=null)
				 {
					 System.out.println(u);
					 System.out.println("Do you want to delete");
					 String ans=sc.next();
					 if(ans.equals("yes"))
				     {
					   n=us.deleterecord(id);	 
						if(n!=0)
						{
							System.out.println("deleted successsfully");
						}
						else
						{
							System.out.println("deleted successsfully");
						}
				 }
				 }
				 break;
			   
				
				case 4:
					  List <MyUser> ls= us.displayAlluser();
					  for(MyUser i:ls)
					  {
						  System.out.println(i);
					  }
					  break;
			  
				case 5:
				    System.out.println("Enter the id  ");
				     id =sc.nextInt();
					System.out.println("Enter the New password ");
					String ps =sc.next();
					System.out.println("Enter the Re-enter  password ");
					String rs =sc.next();
					if(ps.equals(rs))
					{
						 n=us.updatepassword(id,ps);
						if(n>0) {
							System.out.println("Update Succesfully");
						}else {
							System.out.println("Update Not Succesfully");
						}
					}
					else
					{
						System.out.println("Please Enter right Credintials");
					}
				break;
					  
					  
				case 6:
					   sc.close();
					   us.closeConnection();
					   System.exit(0);
					   break;
			
		
					
		           }/*Switch end*/			
		}while(choice!=6);
		}
}


package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Account;
import com.demo.beans.SavingAcc;
import com.demo.service.AccountServices;

public class TestBank {
public static void main(String[] args)
{
	Account[] arr=new Account[10];		
	Scanner sc= new Scanner(System.in);
	int choice,count=0,choice1;
	do
	{
		System.out.println("1.Add savings account");
		System.out.println("2.Add current account");
		System.out.println("3.display Customer");
		System.out.println("4.Deposite Amount");
		System.out.println("5.Check Balance");
		System.out.println("6.Transfer Funds");
		System.out.println("7.Exit");

		System.out.println("enter your choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: AccountServices.addSavingAccount(arr,count);
				count++;
				break;
		case 2:	AccountServices.addCurrentAccount(arr,count);
				count++;
				break;	
					
		case 3: do
				{
					System.out.println("1.display all account holder");
					System.out.println("2. Display saving account holder");
					System.out.println("3.Display Current account holder ");
					
			
					System.out.println("enter your choice");
					choice1=sc.nextInt();
				
					switch(choice1)
					{
						case 1:	AccountServices.displayAllCustomers(arr,count);
								break;
						case 2:	AccountServices.displaySavingCustomers(arr,count);
								break;
						case 3: AccountServices.displayCurrentCustomers(arr,count);
								break;
						
						default: System.out.println("Please Enter valid choice ");
					}
					System.out.println("Do u want to continue in display customers(0/1)");
					choice1=sc.nextInt();
				}while(choice1!=0);
				break;
		case 4: 
				System.out.println("Enter the account number of customer to deposit money ");
				int acc=sc.nextInt();
				int pos=AccountServices.SearchCustomerByAccountNumber(arr, count,acc);
				if(pos!=-1)
				{
					
					System.out.println("Add amount to deposite");
					int amt=sc.nextInt();
					arr[pos].deposite(amt);
				}
				else
				{
					System.out.println("Invalid position");
				}
				break;
		case 5: System.out.println("Enter the account number of customer to check balance ");
				int acc1=sc.nextInt();
				pos=AccountServices.SearchCustomerByAccountNumber(arr, count,acc1);
				if(pos!=-1)
				{
					arr[pos].chech_balance();
				}
				else
				{
					System.out.println("Customer doesnot exist");
				}
		
				break;
		case 6:AccountServices.transferFund(arr,count);break;
		case 7:System.exit(0);break;
		default: System.out.println("Please Enter valid choice ");
		}
		System.out.println("Do you want to continue(0/1)");
		choice=sc.nextInt();
	}while(choice!=0);
}
}

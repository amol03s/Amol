package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Account;
import com.demo.beans.Current;
import com.demo.beans.Customer;
import com.demo.beans.SavingAcc;

public class AccountServices {
	public static void addSavingAccount(Account[] arr,int cnt)
	{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("ENter the name of the customer");
			String name=sc.next();
			
			System.out.println("ENter the account number of the customer");
			int acc=sc.nextInt();
			int pos=AccountServices.SearchCustomerByAccountNumber(arr, cnt,acc);
			if(pos!=-1)
			{
				System.out.println("Customer already exists");
				return;
			}
			
			System.out.println("ENter balance of account");
			double bal=sc.nextDouble();
		  
			arr[cnt]=new SavingAcc(acc,bal,new Customer(name));
		
		
	}
	public static void addCurrentAccount(Account[] arr,int cnt)
	{
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("ENter the name of the customer");
			String name=sc.next();
			
			System.out.println("ENter the account number of the customer");
			int acc=sc.nextInt();
			int pos=AccountServices.SearchCustomerByAccountNumber(arr, cnt,acc);
			if(pos!=-1)
			{
				System.out.println("Customer already exists");
				return;
			}
			
			System.out.println("ENter balance of account");
			double bal=sc.nextDouble();
		  
			arr[cnt]=new Current(acc,bal,new Customer(name));	
		
	}
	public static void displaySavingCustomers(Account[] arr,int cnt)
	{
		for(int i=0;i<cnt;i++)
		{
			if(arr[i] instanceof SavingAcc)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void displayCurrentCustomers(Account[] arr,int cnt)
	{
		for(int i=0;i<cnt;i++)
		{
			if(arr[i] instanceof Current)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void displayAllCustomers(Account[] arr,int cnt)
	{
		for(int i=0;i<cnt;i++)
		{
			
				System.out.println(arr[i]);
			
		}
	}
	public static int SearchCustomerByAccountNumber(Account[] arr,int cnt,int acc)
	{
		
		for(int i=0;i<cnt;i++)
		{
			if(arr[i].getAcc_id()==acc)
			{
				return i;
			}
		}
		return -1;
	}
	public static void transferFund(Account[] arr,int cnt)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the senders account number=");
		int sender=sc.nextInt();
		System.out.println("Enter the receivers account number=");
		int receiver=sc.nextInt();
		int pos=AccountServices.SearchCustomerByAccountNumber(arr, cnt,sender);
		int pos2=AccountServices.SearchCustomerByAccountNumber(arr, cnt,receiver);
		if(pos!=-1 && pos2!=-1)
		{
			System.out.println("Enter the amount ro transfer");
			int amt=sc.nextInt();
			arr[pos2].deposite(amt);
			arr[pos].withdraw(amt);
			System.out.println("Fund transfer is successfull");
		}
		else
		{
			System.out.println("Error in any of the account number");
		}
		
		
	}
}

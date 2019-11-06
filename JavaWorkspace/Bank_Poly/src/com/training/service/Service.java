package com.training.service;

import java.util.Scanner;

import com.training.beans.Custmor;

public class Service {
	
	public static void Addaccount(Custmor [] cust,int cnt) {
		
		for (int i=0;i<cnt;i++) 
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter custmor id");
			int id=sc.nextInt();
			System.out.println("Enter custmor name");
			String name=sc.next();
			System.out.println("Enter custmor mobile no");
			int mob=sc.nextInt();
			System.out.println("Enter custmor email");
			String email=sc.next();
			cust[cnt]=new Custmor(id,name,mob,email);
			
		}
		
		
		
	}

}

package com.training.test;

import java.util.Scanner;

import com.training.beans.Employee;
import com.training.service.EmployeeService;
import com.training.service.EmployeeServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {
			
		EmployeeService e = new EmployeeServiceImpl();
		Scanner sc= new Scanner(System.in);
		int ch=0;
		do {
		System.out.println("Enter the Your Choice");
		System.out.println("1.Add Employee");
		System.out.println("Exit");
		ch = sc.nextInt();
		switch(ch) {
		case 1:int n=e.AddNewEmployee();
				if(n>0) {
					System.out.println("Insertion Successfully");
				}
				else
				{
					System.out.println("Not Done YEt");
				}
			break;
		case 2:System.exit(0);
			break;
			
		default:
			System.out.println("Wrong Choice");
			break;
		}
				
	 }while(ch!=2);
	}//do while

}

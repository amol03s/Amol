package com.training.test;
import java.util.Scanner;
import com.training.beans.Custmor;
import com.training.service.Service;
public class TestBank {

	public static void main(String[] args) {
		int cnt=0;
		Custmor [] Cust =new Custmor[20];  
		Scanner sc = new Scanner(System.in);
		System.out.println("1.AddnewAccount");
		System.out.println("2.WithdrawAmmount");
		System.out.println("3.Deposit");
		System.out.println("4.CheckBalance");
		System.out.println("5.Exit");
		System.out.println("enter the your choice");
	    int ch = sc.nextInt();
		switch(ch) {
		case 1:
			    Service.Addaccount(Cust,cnt);
				cnt++;
				break;
		case 5:
		    
			 break;
	
		}
	}

}

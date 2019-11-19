package com.demo.beans;

import java.util.Scanner;

public class SavingAcc extends Account{

	static float interest=0.04f;
	static int withdraw=25000;
	public SavingAcc(int acc, double bal,Customer cust) {
		super(acc, bal,cust);
		
	}

	@Override
	public void deposite(int amt){
		
		this.setBalance(getBalance()+amt);
		System.out.println("Balance updated succefully");
	}

	@Override
	public void chech_balance() {
	System.out.println("Your account balance is="+this.getBalance());
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void withdraw(int amt) {
		this.setBalance(getBalance()-amt);
		System.out.println("amount withdraw is succefully");
		
	}
	

}

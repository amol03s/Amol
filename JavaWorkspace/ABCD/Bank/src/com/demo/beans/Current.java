package com.demo.beans;

import java.util.Scanner;

public class Current extends Account{
		private int credit_card_no; 
	    public int getCredit_card_no() {
			return credit_card_no;
		}

		public void setCredit_card_no(int credit_card_no) {
		this.credit_card_no = credit_card_no;
		}

		public Current(int acc_id, double balance,Customer cust) {
		super(acc_id, balance,cust);
	
	}
	public void deposite(int amt) {
		
		this.setBalance(getBalance()+amt);
		System.out.println("Balance updated succefully");
	}

	@Override
	public void chech_balance() {
	System.out.println("Your account balance is="+this.getBalance());
	}
	public String toString() {
		return super.toString();
	}

	@Override
	public void withdraw(int amt) {
		this.setBalance(getBalance()-amt);
		System.out.println("amount withdraw is succefully");
		
	}

}

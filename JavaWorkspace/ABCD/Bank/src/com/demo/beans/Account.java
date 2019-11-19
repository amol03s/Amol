package com.demo.beans;

public abstract class Account {
	protected int acc_id;
	protected double balance;
	Customer cust;
	
	public Account(int acc_id, double bal, Customer cust) {
		super();
		this.acc_id = acc_id;
		this.balance = bal;
		this.cust = cust;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	@Override
	public String toString() {
		
		return cust.toString()+"\nAccount number is =" + acc_id + ",\nbalance=" + balance;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public abstract void deposite(int amt);
	public abstract void chech_balance();
	public abstract void withdraw(int amt);
	
}

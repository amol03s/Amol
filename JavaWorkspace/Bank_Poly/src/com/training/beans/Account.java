package com.training.beans;

public class Account {
	private int Accid,Balance;
	private String DateOfOpening;
	
	public Account(int Accid ,int Balance){
		this.Accid=Accid;
		this.Balance=Balance;
	}

	public int getAccid() {
		return Accid;
	}


	public void setAccid(int accid) {
		Accid = accid;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public String getDateOfOpening() {
		return DateOfOpening;
	}

	public void setDateOfOpening(String dateOfOpening) {
		DateOfOpening = dateOfOpening;
	}
	

	@Override
	public String toString() {
		return "Account [Accid=" + Accid + ", Balance=" + Balance + ", DateOfOpening=" + DateOfOpening + "]";
	}
	

}

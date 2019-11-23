package com.training.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="oneAuther")
public class Auther {
@Id
	
	private int aid;
	private String aname;
	private double price;
	
	@OneToMany(mappedBy="Au")
	Set<MyBook> Book=new HashSet<MyBook>();
	private MyBook ob;
	
	public Auther() {
		super();
	}

	public Auther(int aid, String aname, double price) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.price = price;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Auther [aid=" + aid + ", aname=" + aname + ", price=" + price + "]";
	}
	
	
}

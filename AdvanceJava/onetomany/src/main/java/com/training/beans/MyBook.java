package com.training.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="oneBook")
public class MyBook {

	@Id
	private int bid;
	private String bname;
	private String pages;
	@ManyToOne
	private Auther au;
	
	
	public MyBook() {
		super();
	}
	
	public MyBook(int bid, String bname, String pages) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.pages = pages;
	}

	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "MyBook [bid=" + bid + ", bname=" + bname + ", pages=" + pages + "]";
	}
	 
	
}

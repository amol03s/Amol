package com.training.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="MyBook")
public class MyBook {
	@Id
	private int Bid;
	private String bname;
	private double bpri;
	private int bpage;
	
	public MyBook() {
		super();
	}
	public MyBook(int bid, String bname, double bpri, int bpage) {
		super();
		Bid = bid;
		this.bname = bname;
		this.bpri = bpri;
		this.bpage = bpage;
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getBpri() {
		return bpri;
	}
	public void setBpri(double bpri) {
		this.bpri = bpri;
	}
	public int getBpage() {
		return bpage;
	}
	public void setBpage(int bpage) {
		this.bpage = bpage;
	}
	@Override
	public String toString() {
		return "MyBook [Bid=" + Bid + ", bname=" + bname + ", bpri=" + bpri + ", bpage=" + bpage + "]";
	}
	
	

}

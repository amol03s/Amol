package com.training.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="MyBookemb")
public class MyBook {
	@Id
	private String Bid;
	private String bname;
	private double bpri;
	private int bpage;
	@Embedded
	Auther au;
	public MyBook() {
		super();
	}
	public MyBook(String bid, String bname, double bpri, int bpage, Auther au) {
		super();
		Bid = bid;
		this.bname = bname;
		this.bpri = bpri;
		this.bpage = bpage;
		this.au = au;
	}
	public String getBid() {
		return Bid;
	}
	public void setBid(String bid) {
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
	public Auther getAu() {
		return au;
	}
	public void setAu(Auther au) {
		this.au = au;
	}
	@Override
	public String toString() {
		return "MyBook [Bid=" + Bid + ", bname=" + bname + ", bpri=" + bpri + ", bpage=" + bpage + ", au=" + au + "]";
	}
}
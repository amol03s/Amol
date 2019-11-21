package com.demo.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Author {
	private int aid;
	private String aname,mobile;
	
	public Author() {
		super();
	}

	public Author(int aid, String aname, String mobile) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.mobile = mobile;
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
	

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", aname=" + aname + ", mobile=" + mobile + "]";
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}

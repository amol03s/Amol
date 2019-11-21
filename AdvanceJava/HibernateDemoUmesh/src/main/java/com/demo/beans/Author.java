package com.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="author")
public class Author {
	@Id
	private int aid;
	@Column(name="athor_name")
	private String name;
	@Column(name="athor_mobile")
	private String mobile;
	public Author() {
		super();
	}
	public Author(int aid, String name, String mobile) {
		super();
		this.aid = aid;
		this.name = name;
		this.mobile = mobile;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Author [aid=" + aid + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
	

}

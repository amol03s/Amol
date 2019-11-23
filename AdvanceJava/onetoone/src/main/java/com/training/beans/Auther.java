package com.training.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Auther")
public class Auther {

	@Id
	private int id;
	private String aname;
	private String amob;
	public Auther() {
		super();
	}
	public Auther(int id, String aname, String amob) {
		super();
		this.id = id;
		this.aname = aname;
		this.amob = amob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAmob() {
		return amob;
	}
	public void setAmob(String amob) {
		this.amob = amob;
	}
	@Override
	public String toString() {
		return "Auther [id=" + id + ", aname=" + aname + ", amob=" + amob + "]";
	}
	
	
	
	
}

package com.training.beans;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="Auther")
public class Auther {
	@Id
	private int id;
	private String aname;
	private  String mob;
	
	public Auther(int id, String aname, String mob) {
		super();
		this.id = id;
		this.aname = aname;
		this.mob = mob;
	}
	
	

	@Override
	public String toString() {
		return "Auther [id=" + id + ", aname=" + aname + ", mob=" + mob + "]";
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
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public Auther() {
		super();
	}
	

}

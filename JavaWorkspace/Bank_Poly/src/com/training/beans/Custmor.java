package com.training.beans;

public class Custmor {
	
	private int id;
	private String name;
	private int mobNo;
	private String email;
	
	
	
	public Custmor(int id, String name, int mobNo, String email) {
		
		this.id = id;
		this.name = name;
		this.mobNo = mobNo;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Custmor [id=" + id + ", name=" + name + ", mobNo=" + mobNo + ", Email=" + email + "]";
	}
	
	
}

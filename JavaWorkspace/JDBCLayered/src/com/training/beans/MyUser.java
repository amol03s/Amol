package com.training.beans;
public class MyUser {
	private int id;
	private String nm;
	private String ps,role;
	public MyUser(int id, String nm, String ps, String role) {
		super();
		this.id = id;
		this.nm = nm;
		this.ps = ps;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", nm=" + nm + ", ps=" + ps + ", role=" + role + "]";
	}
	

}

package com.training.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity(name="MyBook")
public class MyBook {
    @Id
	private String id;
	
	private String name;
	private String pri;
	private String page;
	
	
	@OneToOne
	private Auther u;

	public MyBook() {
		super();
	}


	public MyBook(String id, String name, String pri, String page, Auther u) {
		super();
		this.id = id;
		this.name = name;
		this.pri = pri;
		this.page = page;
		this.u = u;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPri() {
		return pri;
	}


	public void setPri(String pri) {
		this.pri = pri;
	}


	public String getPage() {
		return page;
	}


	public void setPage(String page) {
		this.page = page;
	}


	public Auther getU() {
		return u;
	}


	public void setU(Auther u) {
		this.u = u;
	}


	@Override
	public String toString() {
		return "MyBook [id=" + id + ", name=" + name + ", pri=" + pri + ", page=" + page + ", u=" + u + "]";
	}
	
	
	
}

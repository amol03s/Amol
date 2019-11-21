package com.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="book1")
public class Book {
	@Id
	private int id;
	@Column(name="book_name")
	private String bname;
	private int price;
	private int pages;
	@OneToOne
	private Author a;
	
	public Book() {
		super();
	}
	public Book(int id, String bname, int price, int pages, Author a) {
		super();
		this.id = id;
		this.bname = bname;
		this.price = price;
		this.pages = pages;
		this.a = a;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public Author getA() {
		return a;
	}
	public void setA(Author a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", price=" + price + ", pages=" + pages + "]";
	}
	
	
	
	

}

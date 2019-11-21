package com.demo.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="books")
public class Book {
	@Id
	private int bid;
	private int price,pages;
	private String bname;
	@Embedded
	private Author author;
	
	public Book() {
		super();
	}

	public Book(int bid, int price, int pages, String bname, Author author) {
		super();
		this.bid = bid;
		this.price = price;
		this.pages = pages;
		this.bname = bname;
		this.author = author;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
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

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", price=" + price + ", pages=" + pages + ", bname=" + bname + ", author=" + author
				+ "]";
	}
	
	
}

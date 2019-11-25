package com.training.beans;

public class Person {
  private int id;
  private String name;
  Address a;
  
  
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", a=" + a + "]";
}


public Person() {
	super();
}


public Person(int id, String name, Address a) {
	super();
	this.id = id;
	this.name = name;
	this.a = a;
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


public Address getA() {
	return a;
}


public void setA(Address a) {
	this.a = a;
} 
  
  
  
}

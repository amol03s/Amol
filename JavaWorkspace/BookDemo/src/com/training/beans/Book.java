package com.training.beans;

public class Book {
	private int Bkid;
	private String BkNm,BAtNm;

	
	public Book(int bkid) {
		super();
		Bkid = bkid;
	}
	public Book() {
		super();
		this.BkNm = null;
	}
	
	public Book(int bkid, String bkNm, String bAtNm) {
		super();
		Bkid = bkid;
		BkNm = bkNm;
		BAtNm = bAtNm;
	}
	
	
	public String toString() {
		return "Bkid="  + Bkid +"\n"+"BkNm=" + BkNm+"\n"+"BAtNm="+ BAtNm ;
	}	
	
	

   public boolean equals(Object ob) {
	   if(this.Bkid==((Book)ob).Bkid)
	   {
		   
		   return true;
	   }
	   return false;
	   }
   
   public String getName(){
	   return BkNm;
	  }
	
   public void setBookName(String bknm) {
	   this.BkNm=bknm;
   }
   
     
	
	
}

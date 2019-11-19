class Book
{
private static int book_id=0;
private String book_name;
private int pages;
private double price;
private String author;


public int getBook_id()
{
	return book_id;
} 
public void setBook_id(int id)
{
	this.book_id=id;
}

public String getBook_name()
{
	return book_name;
} 
public void setBook_name(String bname)
{
	this.book_name=bname;
}


public int getPages()
{
	return pages;
} 
public void setPages(int page)
{
	this.pages=page;
}


public double getPrice()
{
	return price;
} 
public void setPrice(double prc)
{
	this.price=prc;
}


public String getAuthor()
{
	return author;
} 
public void setAuthor(String auth)
{
	this.author=auth;
}

public Book(String bname,int pg,double pr,String aut)
{
this.book_id=++book_id;
this.book_name=bname;
this.pages=pg;
this.price=pr;
this.author=aut;

}
public String toString()
{

return "BookName:"+book_name+"\nBookId:"+book_id+"\npages:"+pages+"\nprice:"+price+"\nauthor:"+author;

}

}

import java.util.Scanner;
class BookService
{
	
	public static void addBook(Book[] b,int cnt)
	{
		Scanner sc2=new Scanner(System.in);
		/*System.out.println("Enter the id of book");
		int bid=sc2.nextInt();*/
		
		System.out.println("Enter the name of book");
		String bname=sc2.next();
		
		System.out.println("Enter the pages of book");
		int pg=sc2.nextInt();
	
		System.out.println("Enter the price of book");
		double pr=sc2.nextDouble();
		
		System.out.println("Enter the author of book");
		String auth=sc2.next();
				
		b[cnt] =new Book(bname,pg,pr,auth);
		

	}

	public static void displayBook(Book[] arr,int cnt)
	{
		for(int i=0;i<cnt;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static int searchBookAuthor(Book[] arr,String nm,int cnt)
	{
		for(int i=0;i<cnt;i++)
		{
	//System.out.println(arr[i].getBook_name());
			if(arr[i].getAuthor().equals(nm))
			{
				return i;
			}
			
		}
		 
			return -1;
	}
	public static void searchBookLessPage(Book[] arr,int pages,int cnt)
	{
		for(int i=0;i<cnt;i++)
		{
			if(arr[i].getPages()<pages)
			{
				System.out.println(arr[i]);				
			}
		}
	}

	public static void searchBookLessPrice(Book[] arr,int prc,int cnt)
	{
		for(int i=0;i<cnt;i++)
		{
			if(arr[i].getPrice()<prc)
			{
				System.out.println(arr[i]);				
			}
		}
	
	}


	public static int deleteBook(Book[] arr,String book,int cnt)
	{
	for(int i=0;i<cnt;i++)
	{
		if(arr[i].getBook_name().equals(book))
		{
			for(int j=i;j<cnt-1;j++)
			{
				arr[j]=arr[j+1];
			}
		
		return i;
		
		}

	}
	return -1;

	}	

public static void modifyBook(Book[] arr,String book,int cnt,double prc)
{
	for(int i=0;i<cnt;i++)
	{
		if(arr[i].getBook_name().equals(book))
		{
			
		arr[i].setPrice(prc);
		
		}

	}
	
}
}


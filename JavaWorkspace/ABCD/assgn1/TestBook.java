import java.util.Scanner;
class TestBook
{
public static void main(String[] args)
{
	Book[] arr=new Book[10];
	Scanner sc=new Scanner(System.in);
	
	int choice;
	 int count=0;
	do
	{
		System.out.println("_________________________________________________");
		System.out.println("1.Add Book");
		System.out.println("2.Display Book");
		System.out.println("3.search Book by author name");
		System.out.println("4.Display all books pages less than given pages");
		System.out.println("5.Display all books prices less than given price");
		System.out.println("6.delete book");
		System.out.println("7.modify book");
		System.out.println("8.exit");
		System.out.println("_________________________________________________");
		System.out.println("Enter your choice");
		choice=sc.nextInt();

		switch(choice)
		{
		case 1:	BookService.addBook(arr,count);
			count++;
			break;
			
		case 2:	BookService.displayBook(arr,count);
			break;
		
		case 3:System.out.println("enter author name for searching");
			String auth=sc.next();
			int pos=BookService.searchBookAuthor(arr,auth,count);
			if(pos==-1)
			{
				System.out.println("Book not found for author "+auth);
			}
			else
			{
				System.out.println("Book found for author "+auth+"at 	location="+pos);
			}
			break;
		case 4: System.out.println("Enter the page count=");
			int pages=sc.nextInt();
			BookService.searchBookLessPage(arr,pages,count);
			
			break;
		case 5: System.out.println("Enter the price");
			int prc=sc.nextInt();
			BookService.searchBookLessPrice(arr,prc,count);
			
			break;
		case 6: System.out.println("Enter book you want to delete");
			String book=sc.next();
			int pos1=BookService.deleteBook(arr,book,count);
			if(pos1==-1)
			{
				System.out.println("Book not found for delete");
			}
			else
			{
				System.out.println("Book delete sucessfully");
			}
			break;

		case 7: System.out.println("Enter book you want to modify price");
			String bk=sc.next();
			System.out.println("Enter modified price");
			double nprc=sc.nextDouble();
			BookService.modifyBook(arr,bk,count,nprc);
			break;
		case 8: System.exit(0);break;
		default:System.out.println("Invalid choice selected");
		
		}
	
	}
	while(choice!=5);
}
}

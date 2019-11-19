import java.util.Scanner;
public class TestArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int r=sc.nextInt();
		System.out.println("enter no of columns");
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		int choice,ch;		
		do
		{
			System.out.println("\t________________");
			System.out.println("\t|1.Accept matrix   |");
			System.out.println("\t|2.Display Matrix  |");
			System.out.println("\t|3.Sum of rows     |");
			System.out.println("\t|4.Sum of columns  |");
			System.out.println("\t|5.Transpose matrix|");
			System.out.println("\t|6.Exit            |");

			System.out.println("enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:ArrayService.accept(arr);	
					break;	
				
				case 2:ArrayService.display(arr);	
					break;
				case 3:ArrayService.rowSum(arr);	
					break;
				case 4:ArrayService.colSum(arr);	
					break;
				case 5:ArrayService.transpose(arr);	
					break;
				case 6:System.exit(0);
					break;
				default:System.out.println("invalid choice na baba");
			}System.out.println("Do you want to continue(1/0)");
			 ch=sc.nextInt();
		}while(ch!=0);
	}
}

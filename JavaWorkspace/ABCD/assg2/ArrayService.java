import java.util.Scanner;
class ArrayService
{
	
	public static void accept(int[][] arr)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[1].length;j++)
			{
				System.out.println("enter"+i+"and"+j);
				arr[i][j]=sc.nextInt();
				
			}
		}
	}

public static void display(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[1].length;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println("");
		}
	}


public static void rowSum(int[][] arr)
{
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{ 
			sum=0;
			for(int j=0;j<arr[1].length;j++)
			{
				
				sum+=arr[i][j];
			}
			System.out.println("sum of "+i+"th row is = "+sum);
	}
}


public static void colSum(int[][] arr)
{
	int sum=0;
	for(int j=0;j<arr[1].length;j++)
	{ 
			sum=0;
			for(int i=0;i<arr.length;i++)
			{
				
				sum+=arr[i][j];
			}
			System.out.println("sum of "+j+"th col is = "+sum);
	}
}


public static void transpose(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[1].length;j++)
			{
				System.out.print(" "+arr[j][i]);
			}
			System.out.println("");
		}
	}

}

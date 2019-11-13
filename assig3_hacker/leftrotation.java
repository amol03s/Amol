import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();


        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int temp;

        for(int i=0;i<d;i++){
            temp=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];        
            }
            arr[n-1]=temp;

        }

         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }   
     
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
         int lastAnswer=0;
        ArrayList<List<Integer>> seqList=new ArrayList<List<Integer>>(N);
        
        for (int i = 0; i < N; i++) 
        {
            seqList.add(new ArrayList<Integer>());
        }
        for(int i=0;i<Q;i++)
        {
            int count=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int index=(x^lastAnswer)%N;
            if(count==1)
                seqList.get(index).add(y);
            if(count==2)
            {
                int n=seqList.get(index).size();
                lastAnswer=seqList.get(index).get(y%n);
                
             System.out.println(lastAnswer);
            }
        }
    
    }
}


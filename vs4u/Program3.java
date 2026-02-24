package com.vs4u;
import java.util.Scanner;
public class Program3 {
       
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=obj.nextInt();
		int sum=0,count=0;
		for(int i=1; i<=n;i++) 
		{
		 if(i%2==0)
		 {
			 sum=sum+i;
		 }
		}
      
       System.out.println("even numbers:"+sum);
       for(int i=10; i>0; i-=2)
       {
    	  if(i%2==0)
    	  {
    		  count=count+i;
    	  }
       }
       System.out.println("Sum:"+count);
	}

}

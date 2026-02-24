package com.vs4u;
import java.util.Scanner;
public class Program19 {

	public static void main(String[] args) {
		int i,j;
		Scanner obj=new Scanner(System.in);
		int count=1;
     for(i=1;i<=5;i++)
     {
    	 for(j=1;j<=i;j++)
    	 {
    		 if(count>0 && count<11)
    		 {
    		 System.out.print(count+" ");
    		 count++;
    		 }
    		
    	 }
    	System.out.println(); 
     }
	}

}

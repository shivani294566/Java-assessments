package com.vs4u;
import java.util.Scanner;
public class Program8 {

	public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter number:");
       int n=obj.nextInt();
       int digit;
       int reverse=0;
       do 
       {
    	   
    	 digit=n%10;
    	 reverse=reverse*10+digit;
    	 n=n/10;
    	 
       }
       while(n>0);
 System.out.println("Reverse of number:"+reverse);
	}

}

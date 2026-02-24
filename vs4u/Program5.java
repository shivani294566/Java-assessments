package com.vs4u;
import java.util.Scanner;
public class Program5 {
   
	public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter number:");
     int n=obj.nextInt();
     for(int i=1; i<=10;i++)
     {
    	 int result=n*i;
    	 System.out.println(n+"*"+i+"="+result);
     }
     
	}

}

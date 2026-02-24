package com.vs4u;
import java.util.Scanner;
public class Program11 {

	public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter number:");
      int num=obj.nextInt();
      int digit;
      int sum=0;
      while(num>0)
      {
    	  digit=num%10;
    	  sum=sum+digit;
    	  num=num/10;
    	  
      }
      System.out.println("Sum of digits of a number:"+sum);
      
	}

}

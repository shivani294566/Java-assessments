package com.vs4u;
import java.util.Scanner;
public class Program9 {

	public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter number:");
      int num=obj.nextInt();
      int fct=1;
      int i=1;
      
    	  do 
    	  {
    		fct=fct*i; 
    		i++;
    	  }
    	  while(i<=num);
    	  System.out.println("Factorial:"+fct);
      }
      
	}



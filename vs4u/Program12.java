package com.vs4u;
import java.util.Scanner;
public class Program12 {

	public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter a number:");
      int n=obj.nextInt();
      int i=1;
     
      while(i<11)
      {
    	  System.out.println(n + " *" + i +" = "+ n*i);
    	  i++;
      }
     
	}

}

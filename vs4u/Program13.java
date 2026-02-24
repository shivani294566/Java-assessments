package com.vs4u;
import java.util.Scanner;
public class Program13 {

	public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter number:");
      int n=obj.nextInt();
      do 
      {
    	System.out.print(n+" ");
    	n--;
      }
      while(n>0);
	}

}

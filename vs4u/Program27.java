package com.vs4u;
import java.util.Scanner;
public class Program27 {

	public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter number");
      int n=obj.nextInt();
		int first=0;
      int second=1;
      int count=2;
      System.out.print(first+","+second);
      for(int i=1;i<=n;i++)
      {
    	  int next=first+second;
    	  System.out.print(","+next);
    	  first=second;
    	  second=next;
    	  count++;
      }
	}

}

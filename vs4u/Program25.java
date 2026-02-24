package com.vs4u;
import java.util.Scanner;
public class Program25 {

	public static void main(String[] args) {
      int rows,cols;
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter upper limit of rows");
      int m=obj.nextInt();
      System.out.println("Enter upper limit of columns");
      int n=obj.nextInt();
      System.out.println("Enter numbers in a matrix");
      int num=obj.nextInt();      
      for(rows=1;rows<=m;rows++)
      {
    	  for(cols=1;cols<=n;cols++)
    	  {
    		  System.out.print(num+" ");
    	  }
      }
	}

}

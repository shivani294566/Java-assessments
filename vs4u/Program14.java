package com.vs4u;
import java.util.Scanner;
public class Program14 {

	public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter upper limit");
     int m=obj.nextInt();
     System.out.println("Enter lower limit");
     int n=obj.nextInt();
     while(m<n)
     {
    	 System.out.print(m+" ");
    	 m++;
     }
     if(m%1==0&&m%2==1)
     {
    	 System.out.print(m+" ");
     }
	}

}

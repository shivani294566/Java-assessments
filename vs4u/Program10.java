package com.vs4u;
import java.util.Scanner;
public class Program10 {

	public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       int first=0,second=1;
       int next;
       System.out.println("Enter n value:");
       int n=obj.nextInt();
       System.out.print(first+","+second);
       int count=2;
       while(count<n) {
    	   
       next=first+second;
       System.out.print(","+next);
       first=second;
       second=next;
       count++;
       
	}

}
}

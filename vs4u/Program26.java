package com.vs4u;
import java.util.Scanner;
public class Program26 {

	public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
        	if(i==2)
        	{
        		System.out.println(i);
        	}
        	if(i%2==1)
        	{
        		System.out.println(i);
        	}
        }
	}

}

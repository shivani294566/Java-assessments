package com.vs4u;
import java.util.Scanner;
public class Divisor {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value n:");
		int n=obj.nextInt();
		for(int i=1; i<=n; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
        
	}

}

package com.vstand4u;
import java.util.Scanner;
public class Solution {
	int add(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Solution obj=new Solution();
        System.out.print("Enter first number:");
        int num1=scanner.nextInt();
        System.out.print("Enter second number:");
        int num2=scanner.nextInt();
        int sum=obj.add(num1, num2);
        for(int i=0;i<3;i++)
        {
        	System.out.println("Sum:"+sum);
        }
	}

}

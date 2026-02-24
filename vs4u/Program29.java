package com.vs4u;
import java.util.Scanner;
public class Program29 {

	public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter salary");
     int salary=obj.nextInt();
     System.out.println("Enter age");
     int age=obj.nextInt();
       if(salary>=20000||age<=25)
       {
    	   System.out.println("Enter required loan amount");
    	   double loanamount=obj.nextDouble();
    	   if(loanamount<=50000)
    	   {
    		   System.out.println("You are eligible for loan");
    	   }
    	   else
    	   {
    		   System.out.println("The maximum loan amount is");
    	   }
       }
       else
       {
    	   System.out.println("You are not eligible for loan");
       }
	}

}

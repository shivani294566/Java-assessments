package com.vstand4u;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
	 System.out.println("Start");
     Scanner obj=new Scanner(System.in);
	 System.out.print("Enter Employee name:\n");
	 String empname=obj.next();
	 System.out.print("Enter Employee age:\n");
	 double age=obj.nextDouble();
	 System.out.print("Enter Employee salary:\n");
	 double salary=obj.nextDouble();
	 System.out.println("empname:"+empname+" " +"age:"+age+" "+"salary:"+salary);
	 
	 System.out.println("End");
	}

}

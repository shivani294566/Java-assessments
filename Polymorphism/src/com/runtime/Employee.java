package com.runtime;

public class Employee {
   void work()
   {
	   System.out.println("Employee is Working");
   }

   public class Developer extends Employee
   {
	   @Override
	   void work()
	   {
		   System.out.println("Deve is working");
	   }
   }
   public class Tester extends Employee
   {
	   @Override
	   void work()
	   {
		   System.out.println("Tester is testing");
	   }
   }
	public static void main(String[] args) {
		Employee e=new Developer();
		e.work();
		Employee emp=new Tester();
		emp.work();
     
	}
}


package com.multipleobject;

public class Employee {
	int ID;
	double salary;
	String name;
	public static void main(String[] args) {
	Employee emp1=new Employee();
	Employee emp2=new Employee();
	emp1.ID=1171;
	emp1.salary=50000;
	emp1.name="Shivani";
	emp2.ID=1271;
	emp2.salary=50000;
	emp2.name="Amulya";
	
	System.out.println("Employee1 details:"+emp1.ID+" "+emp1.salary+" "+emp1.name);
	System.out.println("Employee2 details:"+emp2.ID+" "+emp2.salary+" "+emp2.name);
	
	}

}

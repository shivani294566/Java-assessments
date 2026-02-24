package com.constructor;

public class Employee {
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
	}
	public static void main(String[] args) {
	   Employee e1=new Employee(101,"shivani",50000.350);
	   Employee e2=new Employee(121,"amulya",90000.350);
	   e1.display();
	   e2.display();
      
	}

}

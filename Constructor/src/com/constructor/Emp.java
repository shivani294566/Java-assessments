package com.constructor;

public class Emp {
	int id;
	String name;
	double salary;
	public Emp(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public static void main(String[] args) {
	   Employee e1=new Employee(101,"shivani",50000.350);
	   Employee e2=new Employee(121,"amulya",90000.350);
	   System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.salary);
	
	   
      
	}

}

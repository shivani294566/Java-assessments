package com.abstractt;

public class Employee extends Person{
	@Override
	void m1()
	{
		System.out.println("Working!!");
	}

	public static void main(String[] args) {
     Employee e =new Employee();
     e.m1();
	}

}

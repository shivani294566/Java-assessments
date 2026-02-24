package com.Multiple;

class Vehicle
{
	void test()
	{
		System.out.println("Testing a vehicle");
	}
}
class Car extends Vehicle
{
	void test()
	{
		System.out.println("Testing a vehicle");
	}
}
class Bike extends Vehicle
{
	void test()
	{
		
	}
}
public class MainClass extends Bike{

	public static void main(String[] args) { 
       MainClass m=new MainClass();
       m.test();
	}

}

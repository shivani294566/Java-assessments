package com.usea;
class Car
{
	void drive()
	{
		System.out.println("Car is being driven.");
	}
}
class Driver
{
	void driveCar()
	{
		Car c=new Car();
		System.out.println("Driver is using the Car.");
		c.drive();
	}
}
public class Test {

	public static void main(String[] args) {
     Driver d=new Driver();
     d.driveCar();
	}

}

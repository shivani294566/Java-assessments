package com.constructor;

public class Vehicle {
	Vehicle(String brand,int cost)
	{
		System.out.println("Brand:"+brand+" Cost:"+cost);
	}
	Vehicle(String brand)
	{
		System.out.println("Brand:"+brand);
	}
	Vehicle(String brand,String fuel)
	{
		System.out.println("Brand:"+brand+" Fuel:"+fuel);
	}
	Vehicle(int cost,String brand)
	{
		System.out.println("Cost:"+cost+" Brand:"+brand);
	}

	public static void main(String[] args) {
      Vehicle v1=new Vehicle("BMW");
      Vehicle v2=new Vehicle("Audi",123456);
      new Vehicle(12345,"Polo");
      new Vehicle("Tesla",234567);
	}

}

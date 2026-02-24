package com.vstand4u;

public class Car {
	static
	{
		System.out.println(1);
	}

	public static void main(String[] args) {
     System.out.println(3);
    // Car c=new Car();-> 1 3 2
	}
	{
		System.out.println(2);
	}

}

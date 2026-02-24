package com.hierarchial;
class Vehicle{
	String Brand="Suzuki";
}
class Car extends Vehicle{
	int cost=800000;
	void start() {
		System.out.println("The cost of car starts from: "+cost);
	}
}
class Bike extends Vehicle{
	String Fuel="Diesel";
	void stop() {
		System.out.println("Bike will stop if "+Fuel+" is over");
	}
}
public class Ride {

	public static void main(String[] args) {
       Car c=new Car();
       Bike b=new Bike();
       System.out.println("Bike's fuel is:"+b.Fuel);
       c.start();
       b.stop();
	}

}

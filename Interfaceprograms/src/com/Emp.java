package com;

public class Emp implements Person{
	@Override
	public void eat()
	{
		System.out.println("Eating!!!!");
	}

	public static void main(String[] args) {
      System.out.println(Person.name);
      Emp e =new Emp();
      e.eat();
	}

}

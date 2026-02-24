package com.vstand4u;

public class Person {
	int age;
	String name;
	Person(int age,String name)
	{
	  this.name=name;
	  this.age=age;
	}
	public static void main(String[] args) {
      Person p1=new Person(20,"form");
      Person p2=new Person(21,"Tim");
      System.out.println(p1.age+" "+p1.name);
      System.out.println(p2.age+" "+p2.name);      
	}

}

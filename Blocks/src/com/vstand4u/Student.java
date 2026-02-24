package com.vstand4u;

public class Student {
	static int age;
	static
	{
		//System.out.println("Initializing age to 10");
		age=10;
	}

	public static void main(String[] args) {
      System.out.println("Age:"+Student.age);
	}
    static
    {
    	//System.out.println("Initializing age to 20");
    	age=20;
    }
}

package com.constructor;
class Father
{
	int age=40;
}
class Son extends Father
{
	int age=20;
	void display()
	{
		int age=10;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
	}
}
public class Relation {

	public static void main(String[] args) {
       Son s=new Son();
       s.display();
	}

}

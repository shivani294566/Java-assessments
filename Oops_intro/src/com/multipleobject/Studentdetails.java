package com.multipleobject;

public class Studentdetails {
	String name;
	int marks;
	public static void main(String[] args) {
		Studentdetails std=new Studentdetails();
		Studentdetails std1=new Studentdetails();
		std.name="Shivani";
		std1.name="Amulya";
		std.marks=92;
		std1.marks=89;
		System.out.println("Student 1 details:"+std.name+" "+std.marks);
		System.out.println("Student 2 details:"+std1.name+" "+std1.marks);
		
	}

}

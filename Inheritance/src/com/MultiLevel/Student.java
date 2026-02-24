package com.MultiLevel;
class University{
	String Uniname="VTU";
	void conductExam() {
		System.out.println("VTU is conducting a exam");
	}
}
class College extends University{
	String Clgname="GND";
	void providePlacements() {
		System.out.println("GND is providing placements");
	}
}
class Department extends College{
	String Deptname="CSE";
	void fest(){
	System.out.println("CSE is conducting fest");
}
public class Student {

	public static void main(String[] args) {
     Department d=new Department();
     System.out.println(d.Uniname);
     System.out.println(d.Clgname);
     System.out.println(d.Deptname);
     d.conductExam();
     d.providePlacements();
     d.fest();
	}

}
}

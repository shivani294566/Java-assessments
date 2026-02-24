package com.vs4u;

public class Methodoverloading {
	void display()
	{
		System.out.println();
	}
	void display(int x)
	{
		System.out.println(x+" ");
	}
	void display(String y,int x)
	{
		System.out.println(y+" "+x);
	}
	void display(int x,String y) {
		System.out.println(x+" "+y);
	}

}

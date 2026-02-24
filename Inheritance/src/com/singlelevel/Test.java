package com.singlelevel;

class Father {
	int age=30;
}
class Son extends Father{
	String name="Shivani";
}
	public class Test{
	public static void main(String[] args) {
      Son s=new Son();
      System.out.println(s.age+" "+s.name);
	}

}

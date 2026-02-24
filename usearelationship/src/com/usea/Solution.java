package com.usea;

class Board
{
	void write(String message)
	{
		System.out.println("Subject:"+message);
	}
}
class Teacher
{
	String name;
	Teacher(String name)
	{
		this.name=name;
	}
	void teach()
	{
		Board b=new Board();
		System.out.println(name+" "+"using the board to teach");
		b.write("Java Programming");
	}
}
public class Solution {

	public static void main(String[] args) {
      Teacher t=new Teacher("Karthik");
      t.teach();
	}

}

package com.classdatatype;

public class Hotel {
	Food orderFood(int Choice)
	{
		if(choice==1)
		{
			Idly i=new Idly();
			return i;
		}
		else if(choice==2)
		{
			Dosa d=new Dosa();
			return d;
		}
		else
		{
			Vada v=new Vada();
			return v;
		}
	}
     int choice,i,v,d;
	public static void main(String[] args) {
     
	}

}

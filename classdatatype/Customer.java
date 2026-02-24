package com.classdatatype;

public class Customer {

	public static void main(String[] args) {
     Hotel h=new Hotel();
     Food obj=h.orderFood(2);
     if(obj instanceof Idly)
     {
    	 System.out.println("Order Idly");
     }
     else if(obj instanceof Dosa)
     {
    	 System.out.println("Order Dosa"); 
     }
     else
     {
    	 System.out.println("Order Vada");
     }
	}

}

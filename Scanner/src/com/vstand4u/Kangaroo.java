package com.vstand4u;

public class Kangaroo {
	
     double height=5.8;//Global Variable (non-static)
     void display()
     {
    	 double height=4.4;//local variable(neither static nor non-static)
    	 System.out.println(height);
    	 System.out.println(this.height);//this keyword->To access Global Variable
     }
	public static void main(String[] args) {
        Kangaroo k=new Kangaroo();
        k.display();
        
	}

}

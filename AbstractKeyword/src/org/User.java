package org;

public class User extends Car{
   void start()
   {
	   System.out.println("User starts car.......");
   }
   void stop()
   {
	   System.out.println("Car is stopped........");
   }
	public static void main(String[] args) {
		User u=new User();
		u.start();
		u.stop();
		
       
	}

}

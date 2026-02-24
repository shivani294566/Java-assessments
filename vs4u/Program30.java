package com.vs4u;
import java.util.Scanner;
public class Program30 {

	public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      double balance=1000.0;
      while(true)
      {
    	  System.out.println("1.Check balance");
    	  System.out.println("2.Deposit Money");
    	  System.out.println("3.Withdraw money");
    	  System.out.println("4.Exit");
        System.out.println("Enter your option");
         int opt=obj.nextInt();
         switch(opt)
         {
         case 1:
        	 System.out.println("Current balance:Rs"+balance);
        	 break;
         case 2:
        	 System.out.println("Enter amount to be deposited:");
             double deposit=obj.nextDouble();
             if(deposit>0)
             {
             balance=balance+deposit;
             System.out.println("Deposit successful.New balance:Rs"+balance);
             }
             else
             {
            	 System.out.println("Invalid deposit.");
             }
             break;
         case 3:
        	 System.out.println("Enter withdrawal amount:");
        	 double withdraw=obj.nextDouble();
        	 if(withdraw>0 && withdraw<=balance)
        	 {
        		 balance=balance-withdraw;
        		 System.out.println("Withdraw suuccessful.New balance:Rs"+balance);
        	 }
        	 else if(withdraw>balance)
        	 {
        		 System.out.println("Insufficient balance.");
        	 }
        	 else
        	 {
        		 System.out.println("Invalid withdrawal.");
        	 }
        	 break;
         case 4:
        	 System.out.println("Exiting ATM.");
        	 default:
        		 System.out.println("Invalid choice.");
         }
      }
	}

}

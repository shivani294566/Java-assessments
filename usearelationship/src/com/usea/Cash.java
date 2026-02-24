package com.usea;
class ATM
{
	void withdrawed(String value)
	{
		System.out.println("Cash is being withdrawed:"+value);
	}
}
class Customer
{
	void takecash() 
	{
	ATM a=new ATM();
	System.out.println("Customer is withdrawing the cash");
	a.withdrawed(" "+"$8000");
}
}
public class Cash {

	public static void main(String[] args) {
      Customer c=new Customer();
      c.takecash();
	}

}

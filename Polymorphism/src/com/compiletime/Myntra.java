package com.compiletime;

public class Myntra {
	void purchase(int cost)
	{
		System.out.println("Cost Rs:"+cost);
	}
	void purchase(String brand,String product)
	{
		System.out.println("Brand:"+brand+"Product ,"+product);
	}
	void purchase(String payment)
	{
		System.out.println("Payment:"+payment);
	}
	void purchase(int cost,String product)
	{
		System.out.println("Cost:"+cost+"Product ,"+product);
	}

}

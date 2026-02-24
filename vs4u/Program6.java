package com.vs4u;
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=obj.nextInt();
		int pdt=1;
		for(int i=1;i<=n;i++)
		{
			pdt=pdt*i;
		}
		System.out.println("Product:"+pdt);
	}

}

package com.vs4u;
import java.util.Scanner;
public class Program28 {

	public static void main(String[] args) {
       int sp,cp;
       int p,l;
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter selling price");
       sp=obj.nextInt();
       System.out.println("Enter cost price");
       cp=obj.nextInt();
       if(sp>cp)
       {
    	   p=sp-cp;
    	   System.out.println("The profit is:"+p);
       }
       else
       {
    	   l=cp-sp;
    	   System.out.println("The loss is:"+l);
       }
	}

}

package com.vs4u;
import java.util.Scanner;
public class Even_numbers {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
        for(int i=1; i<10; i++)
        {
        	if(i%2==0)
        	{
           System.out.println("Even numbers between 1 and 10:"+i);	
            }
        	else
        	{
        	System.out.println(" ");
        	}
	    }

}
}

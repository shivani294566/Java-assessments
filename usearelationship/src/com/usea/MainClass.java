package com.usea;
class Printer
{
	void printDocument(String document)
	{
		System.out.println("Printing:"+document);
	}
}
class Computer
{
	void sendToPrinter(Printer printer,String doc)
	{
		printer.printDocument(doc);
	}
}

public class MainClass {

	public static void main(String[] args) {
      Printer myprinter=new Printer();
      Computer mycomputer=new Computer();
      mycomputer.sendToPrinter(myprinter,"HelloWorld.pdf");
	}
}
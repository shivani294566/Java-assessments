package objectasclass;

public class Laptop {
	String brand;
	int cost;
	String ramsize;
	

	public Laptop(String brand, int cost, String ramsize) {
		this.brand = brand;
		this.cost = cost;
		this.ramsize = ramsize;
	}
	public String toString()
	{
		return brand+" "+cost+" "+ramsize;
	}


	public static void main(String[] args) {
      Laptop l1=new Laptop("dell",50000,"12gb");
      Laptop l2=new Laptop("macbook",100000,"20gb");
      Laptop l3=new Laptop("asus",20000,"15gb");
      Laptop[] l= {l1,l2,l3};
      for(int i=0;i<l.length;i++)
      {
    	  System.out.println(l[i]);
      }
	}

}

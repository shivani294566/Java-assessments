package objectasclass;

public class Person {
	int age;
	String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
public String toString()
{
	return age+" "+name;
}

	public static void main(String[] args) {
		Person p1=new Person(22,"bheem");
		Person p2=new Person(23,"chutki");
		//Person[] p=new Person[2];
		Person[] p= {p1,p2};
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
		
       
	}

}

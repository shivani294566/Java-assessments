package objectasclass;

public class Student1 {
	int age;
	String name;
	Student1(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	

	public static void main(String[] args) {
       Student1 s1=new Student1(20,"Bheem");
       Student1 s2=new Student1(21,"Chutki");
       Student1[] s=new Student1[2];
       s[0]=s1;
       s[1]=s2;
       //without overriding the toString()
       for(int i=0;i<s.length;i++)
       {
    	   System.out.println(s[i].age+" "+s[i].name);
       }
	}

}

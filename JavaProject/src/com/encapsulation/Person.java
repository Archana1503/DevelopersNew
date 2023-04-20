package com.encapsulation;//has a relationship in java//

class Address{
	int apin;
	String acity;
	public Address(int apin,String acity) {
		this.apin=apin;
		this.acity=acity;
	}
		
		
		public String toString()
		{
			return apin+" "+acity;
		
	}
}

public class Person {
	int pid;
	String pname;
	
	Address add;
	
public Person(int pid,String pname,Address add)
{this.pid=pid;
this.pname=pname;
this.add=add;
}
public String toString() {
	return pid +" "+pname+" "+add;
	}
	public static void main(String[] args) {
		Person per=new Person(10,"Archana",new Address(12334478,"pune"));
		System.out.println(per);
		

	}

}

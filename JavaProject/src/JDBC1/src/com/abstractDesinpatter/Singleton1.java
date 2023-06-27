package com.abstractDesinpatter;





public class Singleton1 {
	private static Singleton1 obj=null;
	public String str;
	private Singleton1()
	{
		str="Hello java";
	}
	
	static Singleton1 getInstance()
	{
		if(obj==null)
		{
			obj=new Singleton1();
		}
		return obj;
	}
	

	public static void main(String[] args) {
	Singleton1 a=	Singleton1.getInstance();
	Singleton1 b=	Singleton1.getInstance();
	Singleton1 c=	Singleton1.getInstance();
	a.str=(a.str).toUpperCase();
	System.out.println(a.str);
	System.out.println(b.str);
	System.out.println(c.str);
	
	c.str=(c.str).toLowerCase();
	System.out.println(a.str);
	System.out.println(b.str);
	System.out.println(c.str);
	

	}

}

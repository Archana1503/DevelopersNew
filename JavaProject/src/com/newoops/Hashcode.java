package com.newoops;//8.print two object in sysout and see its hashcode is diffrent
                     

public class Hashcode {
	public void movie1() {
		System.out.println("This is movie1");
	}
	public void movie2()
	{
		System.out.println("this is movie 2");
	}

	public static void main(String[] args) {
		Hashcode h1=new Hashcode();
		System.out.println(h1);
		Hashcode h2=new Hashcode();
		System.out.println(h2);
		

	}

}
//output
//com.newoops.Hashcode@27f674d
//com.newoops.Hashcode@49e4cb85

package com.java8feat;


//functional interface which has only and only one method
//Runnable run();
@FunctionalInterface 
interface cake
{
	 
	void baking();
	
	default void show()
	{
		System.out.println("cake ");
	}
	
	
}


public class FunctionalInterface1 {

	public static void main(String[] args) {
		//syntax is
		// ()->expression/statements
		
		cake c=()->{
			System.out.println("strawbwerr cake");
			};
			c.show();
		//c.baking();
		
		
		
		
		
		
	}

}

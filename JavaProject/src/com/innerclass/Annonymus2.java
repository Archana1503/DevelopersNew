package com.innerclass;//annonymus



abstract class Template1{
	abstract void myDesign();
}

public class Annonymus2 {
	

	public static void main(String[] args) {
		Template1 t=new Template1()
				{
			public void myDesign()
			{
				System.out.println("...design...");
			}
				};
				t.myDesign();
		

	}

}

package com.design_pattern1;



public class FactoryClass1 {
	
	public OperatingSystem getInstance(String str)
	{
		if(str.equals("option1"))
		return new Android();
		else if(str.equals("option2"));
		return new Windows();
		
		
		
	}

}

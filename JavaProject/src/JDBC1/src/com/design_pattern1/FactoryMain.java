package com.design_pattern1;


public class FactoryMain {

	public static void main(String[] args) {
	
	FactoryClass1 fc=new FactoryClass1();
	
		OperatingSystem os=fc.getInstance("option1");
		os.specification();
		os.new_feature();
		
	}

}

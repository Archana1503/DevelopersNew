package com.sunday;
interface Electrical{
	public void Fridge();
}
interface Wireless{
	public void Phone();
	
}



public class NonWiresless implements Wireless,Electrical {
	@Override
	public void Fridge() {
		System.out.println("...cooling.. ");
	}
	@Override
	public void Phone() {
		System.out.println("...Calling...");
	}

	

	public static void main(String[] args) {
		

	}

}

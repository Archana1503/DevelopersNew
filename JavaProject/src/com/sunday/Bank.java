package com.sunday;

class Rbi{
	public void ifsccode() {
		System.out.println("ifsc code =344555");
	}
}
class SBI extends Rbi{
	@Override
	public void ifsccode() {
		System.out.println("ifsc of Sbi bank is765438");
	}
}

public class Bank {

	public static void main(String[] args) {
		Rbi r=new Rbi();
		r.ifsccode();
	

	}

}

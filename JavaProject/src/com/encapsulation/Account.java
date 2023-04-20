package com.encapsulation;//half part of this code is in Accouninfo class

public class Account {
	private int acctno;
	private String type;
	private int balance;
	
	public void setAccountNo(int acctno) {
		this.acctno=acctno;
		
	}
	public void setType(String type) {
		
		this.type=type;
	}
	public void setBalance(int balance) {
		this.balance=balance;
		
		
	}
	public int getAcctNo() {
		
		return acctno;
		
	}
	public String getType() {
		return type;
		
	}
	public int getBalance() {
		return balance;
		
	}
	

	public static void main(String[] args) {
		

	}

}

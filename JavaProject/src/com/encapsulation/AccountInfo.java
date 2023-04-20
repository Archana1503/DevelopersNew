package com.encapsulation;

public class AccountInfo {

	public static void main(String[] args) {
		
Account myacct=new Account();
myacct.setAccountNo(544332456);
myacct.setType("current");
myacct.setBalance(5335);
int no=myacct.getAcctNo();
System.out.println(no);
System.out.println(myacct.getType()+" "+myacct.getBalance());

	}

}

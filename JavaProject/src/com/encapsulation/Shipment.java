package com.encapsulation;
 
class Order{
	int oid;
	String oname;
	int custid;
	String ocity;
	
	public Order(int oid,String oname,int custid,String ocity) {
		this. oid=oid;
		this.oname=oname;
		this.custid=custid;
		this.ocity=ocity;
	}
	public String toString() {
		return oid+" "+oname+" "+custid+" "+ocity+" ";  
	}
}
class Mydate{
	int ddd;
	int dmm;
	int dyy;

public Mydate(int ddd,int dmm,int dyy) {
	this.ddd=ddd;
	this.dmm=dmm;
	this.dyy=dyy;
	
}
public String toString() {
	return ddd+" "+dmm+" "+dyy+" ";  
}
}


public class Shipment {
	int sid;
	String sname;
	Order odd;
	Mydate date;
	
	
	public Shipment(int sid,String sname,Order odd,Mydate date) {
		this.sid=sid;
		this.sname=sname;
		this.odd=odd;
		this.date=date;
	}
	public String toString() {
		return sid+" "+sname+" "+odd+" "+date;
	}
	
	
	
	

	public static void main(String[] args) {
		Shipment ship=new Shipment(345,"Accessories",new Order(10,"pendrive",3,"Pune"),new Mydate(12,3,2022));
		System.out.println(ship);
		

	}

}

package com.labassignmentcolle;//Ascending done..descending remaining
import java.util.*;

class Order{
	int o_id;
	String o_date;
	String cur_name;
	
	public Order(int o_id, String o_date, String cur_name) {
		super();
		this.o_id = o_id;
		this.o_date = o_date;
		this.cur_name = cur_name;
	}
	@Override
	public String toString() {
		return "Order [o_id=" + o_id + ", o_date=" + o_date + ", cur_name=" + cur_name + "]";
	}
	
	
}

class Customer1  implements Comparable<Customer1>{
	int c_id;
	String c_name;
	String c_city;
	Order o;
	Arraylist<String>Order;
	
	public Customer1 (int c_id, String c_name, String c_city, Order o) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_city = c_city;
		this.o = o;
	}
	@Override
	public String toString() {
		return "Customer1 [c_id=" + c_id + ", c_name=" + c_name + ", c_city=" + c_city +"o="+ o + "]";
	}

	
	public int compareTo(Customer1 a) {
		return this.o.o_date.compareTo(a.o.o_date);
		
	}
	
	
}

public class CustomerOrd {

	public static void main(String[] args) {
		ArrayList<Customer1>list=new ArrayList();
		
	list.add(new Customer1(1, "Mr.x", "Ahmeganagr",new Order(101,"2002-09-01","flikart")));
	list.add(new Customer1(2, "Mr.y", "Pune",new Order(102,"2001-09-05","Myntra")));
	
	list.add(new Customer1(1, "Mr.A", "nasik",new Order(103,"2015-08-01","Amazon")));
	
	list.add(new Customer1(1, "Mr.z", "Rahuri",new Order(104,"2002-09-01","flikart")));
	System.out.println("....Before sort.....");
		for(Customer1 a:list) {
			System.out.println(a);
		}
	System.out.println(".....After sort ascending.......");
 Collections.sort(list);
 for(Customer1 a:list) {
	System.out.println(a);
}
 
// System.out.println("....After sort descending.....");
// Collections.sort(list,new sortbyDesc());
// for(Customer1 a:list) {
//	 System.out.println(a);
// }
	}

}
//class sortbyDesc implements Comparator <Customer1>{
//	//@Override
//	public int compareTo(Customer1 o1,o2) {
//	return o2.o.o date.compareTo(a.o.o_date);
//	
//}
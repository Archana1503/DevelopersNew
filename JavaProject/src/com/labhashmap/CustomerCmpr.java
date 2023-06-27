package com.labhashmap;//no output custom
import java.util.*;



class Customer{
	int c_id;
	String c_name;
	String c_city;
	public Customer(int c_id, String c_name, String c_city) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_city = c_city;
	}
	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", c_city=" + c_city + "]";
	}
	public int compareTo(Customer o) {
		return this.c_id-o.c_id;
		
	}
	
	
}

public class CustomerCmpr {
	public static void customerSorting(HashMap<Customer, String>hm) {
		TreeMap<Customer,String>tm=new TreeMap<>(hm);
		for(Map.Entry<Customer,String>m:tm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	}

	public static void main(String[] args) {
	HashMap<Customer, String>hm=new HashMap<>();
	hm.put(new Customer(1, "Rahul", "Pune"), "India");
	hm.put(new Customer(5, "Rohan", "nasik"), "India");
	hm.put(new Customer(7, "sneha", "surat"), "Gujarat");
	hm.put(new Customer(1, "sonal", "delhi"), "India");
	
	customerSorting(hm);

	}

}

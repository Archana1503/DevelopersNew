package com.labassignmentcolle;

import java.util.*;

class Employee4 {
	 int id;
	 String name;
	 String country;

	 public Employee4(int id, String name, String country) {
	  super();
	  this.id = id;
	  this.name = name;
	  this.country = country;
	 }

	 @Override
	 public String toString() {
	  return "Employee4 [id=" + id + ", name=" + name + ", country=" + country + "]";
	 }

	}


public class EmplyArrlst {

	public static void main(String[] args) {



	 ArrayList<Employee4> al = new ArrayList<Employee4>();
	 al.add(new Employee4( 101, " Rahul", "india"));
	 al.add(new Employee4( 103, " Mahi", "America"));
	 al.add(new Employee4( 101, " Rahul", "india"));
		
	 for( Employee4 emp : al)
	  System.out.println(emp);
	     System.out.println("----------------------------");
		
	 Collections.sort(al, new IdCom( ));
	 for( Employee4 emp : al)
	  System.out.println(emp);
	 System.out.println("----------------------------");
		
	 Collections.sort(al, new Name1Com( ));
	 for( Employee4 emp : al)
	  System.out.println(emp);
	  System.out.println("----------------------------");
		
	  Collections.sort(al, new CountryCom( ));
	 for( Employee4 emp : al) 
	  System.out.println(emp);
		
	 }
		
	 }



	class IdCom implements Comparator<Employee4> {

	 @Override
	 public int compare(Employee4 o1, Employee4 o2) {
	  if( o1.id > o2.id)
	   return 1;
	  else if (o1.id < o2.id)
	  return -1;
	  else
	   return o1.name.compareTo(o1.name);
	 }

	}

	class Name1Com implements Comparator<Employee4> {

	 @Override
	 public int compare(Employee4 o1, Employee4 o2) {
	  
	  return o1.name.compareTo(o2.name);
	 }

	}

	class CountryCom implements Comparator<Employee4> {

	 @Override
	 public int compare(Employee4 o1, Employee4 o2) {
		
	  return o1.country.compareTo(o2.country);
	 }
	}



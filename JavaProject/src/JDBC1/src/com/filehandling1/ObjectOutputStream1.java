package com.filehandling1;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Employee implements Serializable
{
	int id;
	String name;
	float salary;
	transient int pincode;
	public Employee(int id, String name, float salary, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", pincode=" + pincode + "]";
	}
	
	
	
}


public class ObjectOutputStream1 {

	public static void main(String[] args) throws IOException {
		
		File f=new File("e:/fileHandling/emp.dat");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		ArrayList<Employee> al=new ArrayList();
		
		Employee e1=new Employee(1,"Rohan",23000,1111);
		Employee e2=new Employee(2,"Shyamal",20000,2222);
		Employee e3=new Employee(3,"sonal",23000,3333);
		Employee e4=new Employee(4,"Shruti",25000,4444);
		Employee e5=new Employee(5,"Sneha",29000,5555);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		oos.writeObject(al);
		System.out.println("file written sucessfully");
		oos.close();
		
	}

}

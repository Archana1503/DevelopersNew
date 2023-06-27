package com.filehandling1;


import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ObjectInputStream1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f=new File("e:/fileHandling/emp.dat");
		FileInputStream fos=new FileInputStream(f);
		ObjectInputStream oos=new ObjectInputStream(fos);
		
		
		ArrayList<Employee>al=(ArrayList<Employee>) oos.readObject();
		Iterator<Employee> it=al.iterator();
		
		while(it.hasNext())
		{
			Employee e=it.next();
			System.out.println(e.id+" "+e.name+" "+e.salary+" "+e.pincode);
		}

	}

}








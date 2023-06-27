package com.labhashmap;//display student grade
import java.util.*;
import java.util.Map.Entry;


class Student8{
	int id;
	String name;
	float per;

	
	public Student8(int id, String name, float per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	@Override
	public String toString() {
		return "Student8 [id=" + id + ", name=" + name + ", per=" + per + "]";
	}


public static void display(HashMap<String,String>hm) {
	System.out.println("Enter name Whose grade to display");
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	
	Set myMap=hm.entrySet();
	Iterator<Map.Entry<String,String>>it=myMap.iterator();
	while(it.hasNext()) {
		Map.Entry<String,String>m=it.next();
		if(m.getKey().equals(name)) {
		System.out.println(m.getKey()+" "+m.getValue());
}

}	
	
}
}

public class StudGrade {

	public static void main(String[] args) {
	ArrayList<Student8>al=new ArrayList();
	
	al.add(new Student8(1,"Archana",90));
	al.add(new Student8(2,"Rohab",70));
	al.add(new Student8(6,"Sonal",60));
	al.add(new Student8(1,"Ravi",90));
	al.add(new Student8(1,"Shyam",50));
	
	//System.out.println("Arraylist print");
	//for(Student8 s:al) {
		//System.out.println(al);
	HashMap<String,String>hm=new HashMap<String,String>();
	
	Iterator<Student8>itr=al.iterator();
	String grade="";
	
	while(itr.hasNext()) {
	Student8 s =itr.next();
	if(s.per>90) {
		grade="A";
		
	}else if(s.per<90 &&s.per>50) {
		grade="B";
	}else if(s.per<50 &&s.per>35) {
		grade="c";
		
	}else {
		grade="Fail";
		
	}
   hm.put(s.name,grade);
	}
	
	Set myMap=hm.entrySet();
	Iterator<Map.Entry<String,String>>it=myMap.iterator();
	while(it.hasNext()) {
		//Map.Entry<String,String>m=it.next();
		//System.out.println(m.getKey()+" "+m.getValue());
		System.out.println(it.next());
		
	}
	Student8.display(hm);
	
	}
}


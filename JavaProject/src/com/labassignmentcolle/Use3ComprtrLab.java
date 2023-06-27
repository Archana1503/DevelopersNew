package com.labassignmentcolle;
import java.util.*;
/*1) WAP to create a class Student with (rollNo, nameand age). Create 3 Comparator implementations
for each Student attribute (i.e. rollNo, name and age)
. Create and add 4 Student objects in ArrayList. Print ArrayList.
 Sort the list using rollno comparator. Print ArrayList.
 Sort the list using name comparator. Print ArrayList.
 Sort the list using age comparator. Print ArrayList.
 Observe the sorted outputs in case the name, age and name + age are same.
*/



class StudentCmpr{
 int rollno;
 String name;
 int age;
 public StudentCmpr(int rollno, String name, int age) {
  super();
  this.rollno = rollno;
  this.name = name;
  this.age = age;
 }
 @Override
 public String toString() {
  return "Student3 [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
 }
	
}


 public class Use3ComprtrLab {

		public static void main(String[] args) {
			
  ArrayList<StudentCmpr> al= new ArrayList<StudentCmpr>();
  al.add(new StudentCmpr(33, "SArchana", 23));
  al.add(new StudentCmpr(14, "Aniket", 44));
  al.add(new StudentCmpr(30, "Rahul", 44));
  al.add(new StudentCmpr(17, "Tina", 25));
  System.out.println("Before sorting");
  for( StudentCmpr s : al) 
   System.out.println(s);
  System.out.println("sort by roll number");
   
   Collections.sort(al, new RollnoComparator());
   for( StudentCmpr s : al) 
    System.out.println(s);
   
   System.out.println("sort by name");
   
   Collections.sort(al, new NameCom());
   for( StudentCmpr s : al) 
    System.out.println(s);
   System.out.println("sort by age");
   
   Collections.sort(al, new AgeCom());
	
   for( StudentCmpr s : al) {
    System.out.println(s);
   }
  }
  
 }


class AgeCom implements Comparator<StudentCmpr>{

 @Override
 public int compare(StudentCmpr s1, StudentCmpr s2) {
  
 // return s1.age - s2.age;
  if (s1.age >s2.age)
   return 1;
  else if(s1.age<s2.age)
   return -1;
  else
   return s2.name.compareTo(s1.name);
 }

}
class NameCom implements Comparator<StudentCmpr>{

 @Override
 public int compare(StudentCmpr o1, StudentCmpr o2) {
  
  return o1.name.compareTo(o2.name);
 }
	
}
class RollnoComparator implements Comparator<StudentCmpr>{

 @Override
 public int compare(StudentCmpr r1, StudentCmpr r2) {
	
  return r1.rollno-r2.rollno;
 }
}






/*

2)Create and add 4 more Employee objects in ArrayList. Print ArrayList. Sort ArrayList using
Collections.sort(list) based on name. If name are same then sort on id. Print arrayList.
Add Profile(state,country) object in Employee object. Do sorting of employees on the country basis.*/
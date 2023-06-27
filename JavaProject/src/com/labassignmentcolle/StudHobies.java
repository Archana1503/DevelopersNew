package com.labassignmentcolle;

import java.util.*;

class Student111{
 int id;
 String name;
 List<String>hobbies;
 public Student111(int id, String name, List<String> hobbies) {
  super();
  this.id = id;
  this.name = name;
  this.hobbies = hobbies;
 }
 @Override
 public String toString() {
  return "Student13 [id=" + id + ", name=" + name + ", hobbies=" + hobbies + "]";
 }
	
}
public class StudHobies {

 public static void main(String[] args) {
 ArrayList<Student111> al = new ArrayList<Student111>();
 al.add(new Student111 (100, "Archana",new ArrayList<>(Arrays.asList("dancing", "reading") )));
 al.add(new Student111 (200, "Aniket", new ArrayList<>(Arrays.asList("movie watching", "playing")) ));
 al.add(new Student111 (300, "Anvi", new ArrayList<>(Arrays.asList("Travling", "Writting")) ));
	
	
for(Student111 s :al)
{
 System.out.println(s.name+" "+s.hobbies);
}
 }

}



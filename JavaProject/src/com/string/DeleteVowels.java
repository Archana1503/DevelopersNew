package com.string;//delete vowels
import java.util.Scanner;

public class DeleteVowels {



public static void main(String args[]){

Scanner sc=new Scanner(System.in);
String s=sc.next();
String newdel=” ”;
for (int i = 0; i < s.length(); i++) {
if(s.charAt(i)=='a'||s.charAt(i)=='A'){
newdel=newdel+"";
}
else if(s.charAt(i)=='e'||s.charAt(i)=='E'){
newdel=newdel+"";
}
else if(s.charAt(i)=='i'||s.charAt(i)=='I'){
newdel=newdel+"";
}
else if(s.charAt(i)=='o'||s.charAt(i)=='O'){
newdel=newdel+"";
}
else if(s.charAt(i)=='u'||s.charAt(i)=='U'){
newdel=newdel+"";
}
else{
newdel=newdel+s.charAt(i);
}
}
System.out.println(newdel);
}
}
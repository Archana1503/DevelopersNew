package com.newoops;//10.
//
public class AssignId {
	int id=10;
	String name="anavi";

	public static void main(String[] args) {
		//you canot access id directly without creating object
		//System.out.println(id);
		//System.out.println(name);
		
		
    AssignId A=new AssignId();
    System.out.println(A.id);
    System.out.println(A.name);
    
    
    A1.id=20;
    A1.name="aaa";
    
    System.out.println(A1.id);
    System.out.println(A1.name);
    
    
    
    

	}

}

package com.staticdemos;

public class AccessModifier {
	private int x=10;
	String city ="pune";
	private void doPrivate() {
		System.out.println("this is private");
	}
	protected int z=200;
	public float per=50.50f;
	
	private void msg(){
		System.out.println("Hello java");}  //method
	void put(){
		System.out.println("default method");}  
	protected void input(){
		System.out.println("Hello protected");}  
	
	
	

	public static void main(String[] args) {
		
		AccessModifier f=new AccessModifier();
		
		System.out.println(f.x);
		f.doPrivate();
		System.out.println(f.city);
		System.out.println(f.z);
		System.out.println(f.per);
		
		
		

	}

}

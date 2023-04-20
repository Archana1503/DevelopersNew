
package com.thisNew;

public class Games {
	int gid;
	String g_game;
	int price;
	
	public Games() {
		this(200,"hocky",1000);
		System.out.println("Welcome to game zone");
	}
	public Games(int gid,String g_name,int price) {
		System.out.println("this is with parameter..");{
			
			
			this.gid=gid;
		   this.g_game=g_name;
			this.price= price;
			
				
			}
			
		
		public void showGames() {
			System.out.println(gid+" "+price);
		}
	

	public static void main(String[] args) {
		Games g1=new Games();
	g1.showGames();
		
		
		//Games g2=new Games(1,"football",780);
		//g2.showGames();
		

	}

}

package com.newoops;//13.calculate box and calculate volume of box

public class Box {

	
		

		int length;
		int width;
		int height;
		float Volume;
		
	public void acceptDetails(int l,int w,int h) {
		length=l;
		width=w;
		height=h;
	}
	public void CalculateVolume() {
		Volume=length*width*height;
	}
		
		public void display() {
			System.out.println(length+" "+width+" "+height+" "+Volume+" ");
			
		}
		
		

		public static void main(String[] args) {
			
			Box B1 = new Box();
		   B1.acceptDetails(10,5,7);
			B1.CalculateVolume();
			B1.display();
			
			
			Box B2=new Box();
			B2.acceptDetails(20, 30,25);
			B2.CalculateVolume();
			B2.display();
}
}
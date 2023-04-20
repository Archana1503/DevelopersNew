package com.sunday;

public class VolumeCalculator {
	
	public  double calculateVolume(double radius,double height)
	{
	double volume1=radius*height;
	return volume1;
		
	}
	public double calculateVolume(int radius,int height) {
		double volume=3.14*radius*radius*height;
		return volume;
	}
	
	
public double calculateVolume(int breadth,int length,int height ) {
	double cuboidvolume=breadth*length*height;
	return cuboidvolume;
}
	public static void main(String[] args) {
		
		VolumeCalculator v=new VolumeCalculator();
		
		 System.out.println("volume of cylinder "+v.calculateVolume(13,15.3));
		System.out.println(+v.calculateVolume(23,32,12 ));
		
	  
		
		
		

	}

}
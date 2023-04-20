package com.first;
import java.util.Scanner;

public class CentimeterToMeterKm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.println("Enter the length in centimeter::\n");

        float cm = in.nextFloat();
        float mtr;
        float km;

        

        /* Convert centimeter into meter and kilometer */
	    mtr = (float)(cm / 100);
	    km = (float)(cm / 100000);

        // Output
        System.out.print("\n");
        System.out.println("Length in Meter      = " + mtr + " meter");
        System.out.println("Length in Kilometer  = " + km + " kilometer");
    }
}
		// TODO Auto-generated method stub

	

package com.assignment;
import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {


	//Gross salary=Basic salery+HRA=DA; basic=sc.nextDouble();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Basic Salary :");
	
	int bs = sc.nextInt();
	float hra,da,tot;
	if(bs<=10000)
	{			
		hra = bs*.20f/100;
		da = bs*80f/100;
	}
	else if(bs<=20000)
	{
		hra = bs*25f/100;
		da = bs*9f/100;
	}
	else
	{
		hra = bs*3f/100;
		da = bs*95f/100;
	}
	System.out.println("Gross Salary : "+(bs+hra+da));
	

}
}


package com.LabAssignment;//check prime number
import java.lang.reflect.Array;
import java.util.Scanner;

public class XobinTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}


    for(int i=0; i<arr.length; i++){
        boolean isPrime = true;

        for (int j=2; j<i; j++){

            if(i%j==0){
                isPrime = false;
                break;
            }
        }
     
        if(isPrime)

            System.out.println(i + " are the prime numbers in the array ");
    }
}
}

package com.assignment4th;//write a program which deletes dublicate elemnt from an arrya
//in  [a,b,b,n,u,y,x,s,y]output[a,n,u,x,s]

public class DeleteDublicate {

	public static void main(String[] args) {
	
		int arr1[] = {20, 20, 30, 40, 50, 50, 50};  
		System.out.println("Original array length: "+arr1.length);
		System.out.print("Array elements are: ");
       for (int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i]+" ");
        }
		System.out.println("\nThe new length of the array is: "+array_sort(arr1));
			
    }
    
    public static int array_sort(int[] arr1) {
         int index = 1;
        for (int i = 1; i < arr1.length; i++) 
            if (arr1[i] != arr1[index-1])
                arr1[index++] = arr1[i];
            
            
        
        
	  return index;
	 
    }

	}



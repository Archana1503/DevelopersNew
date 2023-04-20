package com.LabAssignment;//question5.test equality of two arrays//

public class CheckEquality {

	public static void main(String[] args) {
		int arr1[]= {12,22,32,42,52,62};
		int arr2[]= {52,22,62,12,42,30};
		boolean result=true;
		
		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i=i++) {
				//for(int j=0;j<arr2.length;j++) {
				if(arr1[i]!=arr2[i]) {
					result=false;
				}
			}
		}
		
				else {
					result=false;
				}
		
		if(result==true) {
			
			System.out.println("arrays are equall");	
			}
		else {
			System.out.println("arrays are not equall");
			
		}
		
			

	}

}



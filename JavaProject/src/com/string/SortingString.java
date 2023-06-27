package com.string;
import java.util.Comparator;

public class SortingString {
	public void showCity(String city) {
		String[]sort=city.split(" ");
		
		String sortedString=" ";
		
		for(int i=0;i<sort.length;i++) {
			for(int j=i+1;j<sort.length;j++) {
			if(sort[i].compareTo(sort[j])>0) {
				String temp=sort[i];
				sort[i]=sort[j];
				sort[j]=temp;
			}
		}
		}
		for(int i=0;i<sort.length;i++) {
			 sortedString = sortedString +" "+sort[i];
			}
			
			System.out.println(sortedString);
			}
			
		public static void main(String[] args) {
		
String[]city= {"pune","chennai","mumbai","banglore"};

SortingString s=new SortingString();
 // s.showCity(city);

	}

}


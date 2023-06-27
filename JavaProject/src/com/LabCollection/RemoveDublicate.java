package com.LabCollection;
import java.util.ArrayList;

public class RemoveDublicate {
	
	public static void checkDublicate(ArrayList<String>al) {
		ArrayList<String>al2=new ArrayList<>();
	
		for(int i=0;i<al.size();i++) {
			boolean isPresent=false;
			int count=0;
			
			for(int j=i-1;j>=0;j--) {
				if(al.get(i)==al.get(i)) {
					isPresent=true;
					break;
				}
			}
			if(isPresent==false) {
				for(int k=i+1;k<al.size();k++) {
					if(al.get(i)==al.get(k));
					al.remove(al.get(k));
					
				}
			}
			al2.add(al.get(i));
		}//System.out.println(al2);
	
	
	}

	

			
	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList();
		al.add("sunday");
		al.add("monday");
		al.add("sunday");
		al.add("tuesday");
		al.add("monady");
		al.add("wednesday");
		System.out.println(al);
		
		RemoveDublicate r=new RemoveDublicate();
		r.checkDublicate(al);
		
		

	}

}

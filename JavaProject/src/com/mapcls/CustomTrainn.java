package com.mapcls;//if id and name are same then put only ome train in map
import java.util.*;
import java.util.Map.Entry;

class Train{
	int tid;
	String name;
	int sits;
	
	public Train(int tid, String name, int sits) {
		super();
		this.tid = tid;
		this.name = name;
		this.sits = sits;
	}

	@Override
	public String toString() {
		return "Train [tid=" + tid + ", name=" + name + ", sits=" + sits + "]";
	}
	@Override
	public int hashCode()
	{
		return tid;
	}
	@Override
	public boolean equals(Object o)
	{
		Train t=(Train)o;
		if(this.tid==t.tid&&this.name.equals(t.name))
		{
			return true;
		}
		return false;
	}
	
	
}

public class CustomTrainn {

	public static void main(String[] args) {
		HashMap<Train,Integer>hm=new HashMap();
		hm.put(new Train(1,"aa",30),3000 );
		hm.put(new Train(1,"aa",20),5000 );
		hm.put(new Train(3,"bb",70),2000 );
		for(Entry<Train, Integer> m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
	
		
		
		

	}

}
}

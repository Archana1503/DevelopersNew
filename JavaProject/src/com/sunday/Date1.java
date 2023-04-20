package com.sunday;

public class Date1 {
	int mm,dd,yyyy;
	
	public Date1(int mm,int dd,int yyyy) {
		super();
		this.mm=mm;
		this.dd=dd;
		this.yyyy=yyyy;
		
	}
	public String toString() {
		return mm+"/"+dd+"/"+yyyy;
	}

	}

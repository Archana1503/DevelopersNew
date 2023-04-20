package com.constructor;

public class CarParameter {

	int modelno;
	String car_name;
	int price;
	
	public CarParameter(int mid, String cname ,int amount) {
		modelno=mid;
		car_name=cname;
				price=amount;
				
	}
	public void showCarParameter() {
		System.out.println(modelno +" "+car_name+ " "+price);
	}
	
	

	public static void main(String[] args) {
		CarParameter audi=new CarParameter(2344,"Audi",67988); 
		audi.showCarParameter();
		

	}

}

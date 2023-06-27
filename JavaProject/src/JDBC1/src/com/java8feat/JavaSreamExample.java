package com.java8feat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	} 
    
}  

public class JavaSreamExample {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  
       
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f)); 
        
        
   List<Product> st= productsList.stream()
		   
   
                       .filter(p->p.price>28000)
                       .collect(Collectors.toList());
                        System.out.println(st);

	}

}

package Inheritance;
class Animall{
	String foodType;

public void run() {
	System.out.println("ANIMAL IS RUNNING.......");
}
	
}
class Dog  extends Animall{
	public void showFood() {
		foodType="DogFood";
		System.out.println(foodType);
	}
}

public class Animal {
	

	
	


	public static void main(String[] args) {
		
		Dog dg=new Dog();
		dg.showFood();
		dg.run();

	}

}

package com.sunday;

public class Cycle {
    String brand_name;
    String color;
    int no_OfWheels;

    Cycle() {
        this("Atlas", "Black", 5);
        System.out.println("I am a default constructor");
    }

    public Cycle(int price, int speed) {
        this();
        System.out.println("Price of cycle: " + price);
        System.out.println("Speed of cycle: " + speed);
    }

    public Cycle(String brand_name, String color, int no_OfWheels) {
        this.brand_name = brand_name;
        this.color = color;
        this.no_OfWheels = no_OfWheels;
    }

    public void display() {
        System.out.println("Brand name: " + brand_name + ", Color: " + color + ", Number of wheels: " + no_OfWheels);
    }

    public static void main(String[] args) {
        Cycle c = new Cycle(7000, 100);
        c.display();
    }
}

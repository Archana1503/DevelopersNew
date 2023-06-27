package com.writtenassign;


public class Loop2 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            int mysteryInt = 100;
            mysteryInt -= i;
            System.out.println(mysteryInt);
        }
    }
}

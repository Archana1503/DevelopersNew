package com.writtenassign;
import java.util.*;



public class ThirdQuestion {
    public static void main(String[] args) {
        int i = 1;
        int k = 1;
        while (i <= 5) {
            k *= i;
            i++;
        }
        System.out.println("k=" + k + " i=" + i);
    }
}

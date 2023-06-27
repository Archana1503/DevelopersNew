package com.sunday;//employee has passport//have to chk once

import java.util.Date;

public class Employee {
    int e_id;
    String name;
    Passport p;
    
    Employee(int e_id, String name, Passport p) {
        this.e_id = e_id;
        this.name = name;
        this.p = p;
    }
    
    public String toString() {
        return e_id + " " + name + " " + p.p_no + " " + p.issue_date + " " + p.validity;
    }

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        Passport p = new Passport(67676, new Date(1234567890L), 5);
        Employee e = new Employee(101, "Mrs Pooja", p);
        System.out.println(e);
    }
}

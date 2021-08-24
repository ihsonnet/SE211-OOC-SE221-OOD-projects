package com.supplyMS;

import java.util.ArrayList;

public class Customer {
    private int id;
    private String Name;
    private ArrayList<String> regCustomers = new ArrayList<>();

    public Customer() {
    }

    public Customer(int id, String name) {
        this.id = id;
        Name = name;
    }

    public void register(String name){
        this.regCustomers.add(name);
        System.out.println(name+" is Registered.\n");
    }

    public void searchRegCustomer(String name){
        if (this.regCustomers.contains(name)){
            System.out.println("This Customer is Registered Customer.");
        }
        else {
            System.out.println("Customer Not Found! (Not Registered)");
        }
    }
}

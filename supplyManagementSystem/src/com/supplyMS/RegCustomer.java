package com.supplyMS;

public class RegCustomer extends Customer {

    public RegCustomer(int id, String name) {
        super(id,name);
        super.register(name);
    }
}

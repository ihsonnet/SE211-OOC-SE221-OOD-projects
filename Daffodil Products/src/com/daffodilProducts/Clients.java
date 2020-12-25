package com.daffodilProducts;

abstract class Clients {
    private String name;
    private int id;
    private String customerType;
    public Clients() {
    }
    public Clients(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getCustomerType() {
        return customerType;
    }
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    abstract void giveOrder(int amount,int Customer);
}

package com.daffodilwater;

public class NonRegCustomer extends Customer{
    String customerType;
    public NonRegCustomer() {
    }
    public NonRegCustomer(String name, int id) {
        super(name, id);
    }
    @Override
    void giveOrder(int amount,int orderId) {
        if(amount > 1000 ){
            Order o = new Order(orderId, amount);
            System.out.println("\nCustomer ID:" + getId() + "\nCustomer Type: Non Registered"
                    +"\nName:" + getName() + "\nAmmount of Packet:" + amount + "\nTotal Price: "+ amount*100 +
                    "\n");
        }
    }
}

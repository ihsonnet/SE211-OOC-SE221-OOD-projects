package com.daffodilwater;

public class RegCustomer extends Customer{
    private int totalOrderedAmount;
    public RegCustomer() {
    }
    public RegCustomer(String name, int id) {
        super(name, id);
    }
    public int getTotalOrderedAmount() {
        return totalOrderedAmount;
    }
    public void setTotalOrderedAmount(int totalOrderedAmount) {
        this.totalOrderedAmount = totalOrderedAmount;
    }
    @Override
    void giveOrder(int amount,int orderId) {
        if(amount > 1000 ){
            Order o = new Order(orderId, amount);
            setTotalOrderedAmount(getTotalOrderedAmount() + o.getOrderedAmount());
            System.out.println("\nCustomer ID: " + getId() + "\nCustomer Type: Registered" +"\nName: "
                    + getName() + "\nAmmount of Packet:" + amount + "\nTotal Price: "+ amount*100 + "\n");
        }
    }
}

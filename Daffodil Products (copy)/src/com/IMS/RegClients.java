package com.IMS;

public class RegClients extends Clients {
    private int totalOrderedAmount;
    public RegClients() {
    }
    public RegClients(String name, int id) {
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
        float total= amount*200;
        float vat = (float) (total*0.05);
        float withVat = total+vat;

        if(amount > 5000 ){
            Order o = new Order(orderId, amount);
            setTotalOrderedAmount(getTotalOrderedAmount() + o.getOrderedAmount());
            System.out.println("\nCustomer ID: " + getId() + "\nCustomer Type: Registered" +"\nName: "
                    + getName() +"\nOrder Status: Successful."+  "\nOrder Amount: " + amount+ " Pieces" + "\nTotal Price: "+withVat + "\n");
        }
        else {
            System.out.println("\nCustomer ID:" + getId() + "\nCustomer Type:Registered"
                    +"\nName:" + getName() +"\nOrder Status: Failed."+  "\n*Amount of Order must be more then 5000");
        }
    }
}

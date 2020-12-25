package com.daffodilProducts;

public class NonRegClients extends Clients{
    String ClientType;
    public NonRegClients() {
    }
    public NonRegClients(String name, int id) {
        super(name, id);
    }
    @Override
    void giveOrder(int amount,int orderId) {
        float total= amount*200;
        float vat = (float) (total*0.05);
        float withVat = total+vat;

        if(amount > 5000 ){
            Order o = new Order(orderId, amount);
            System.out.println("\nClient ID: " + getId() + "\nClient Type: Non Registered"
                    +"\nName:" + getName() +"\nOrder Status: Successful."+  "\nOrder Amount:" + amount +" Pieces" +"\nTotal Price: "+withVat +
                    "\n");
        }
        else {
            System.out.println("\nClient ID:" + getId() + "\nClient Type: Non Registered"
                    +"\nName:" + getName() +"\nOrder Status: Failed."+ "\n*Amount of Order must be more then 5000");
        }
    }
}

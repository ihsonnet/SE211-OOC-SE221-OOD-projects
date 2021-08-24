package com.supplyMS;

public class SupplyManagementSystem {
    public static void main(String[] args) {
        RegCustomer customer1 = new RegCustomer(1, "Ronobir");
        NonRegCustomer customer2 = new NonRegCustomer(1, "Kawser");
        RegCustomer customer3 = new RegCustomer(1, "Joshim");

        PrimiumProduct product1 = new PrimiumProduct(20, "Pam Oil", 200L);

        Customer customer = new Customer();
        customer.searchRegCustomer("Kawser");

        Product product = new Product();
        product.buyProduct(20, 200L, 5);
    }
}

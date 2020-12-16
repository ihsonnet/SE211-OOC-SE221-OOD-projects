package com.daffodilwater;

public class DaffodilWaterSMS {
    public static void main(String[] args) {
        RegCustomer reg[] = new RegCustomer[100];
        int orderId = 0,totalReg = 0, totalSupervidor = 0;
        FactorySupervisor sup = new FactorySupervisor("SAM Matiur Rahman", 1);
        System.out.println("\n::::::::::: DAFFODIL WATER ::::::::::::\n");
        reg[totalReg] = new RegCustomer("Rahim ALi", totalReg);
        reg[totalReg].giveOrder(5001, orderId++);
        totalReg++;
        reg[totalReg] = new RegCustomer("Karim Mia", totalReg);
        reg[totalReg].giveOrder(1001, orderId++);
        totalReg++;
        NonRegCustomer nr = new NonRegCustomer("Fahim Ahmed", orderId++);
        nr.giveOrder(2000, 101);
        System.out.println("::::::: Supervisor Area ::::::::");
        sup.supervise(reg, totalReg);
    }
}

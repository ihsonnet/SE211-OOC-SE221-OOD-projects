package com.IMS;

public class DaffodilProducts {
    public static void main(String[] args) {
        RegClients reg[] = new RegClients[100];
        int orderId = 0,totalReg = 0, totalSupervidor = 0;
        FactorySupervisor sup = new FactorySupervisor("SAM Matiur Rahman", 1);

        System.out.println("\n::::::::::: DAFFODIL PRODUCTS ::::::::::::\n");
        reg[totalReg] = new RegClients("Rahim ALi", totalReg);
        reg[totalReg].giveOrder(5001, orderId++);
        totalReg++;
        reg[totalReg] = new RegClients("Karim Mia", totalReg);
        reg[totalReg].giveOrder(1001, orderId++);
        totalReg++;
        reg[totalReg] = new RegClients("Mahtab ALi", totalReg);
        reg[totalReg].giveOrder(10200, orderId++);
        totalReg++;
        NonRegClients nr = new NonRegClients("Fahim Ahmed", orderId++);
        nr.giveOrder(7000, 101);

        System.out.println("::::::: Supervisor Area ::::::::");
        sup.supervise(reg, totalReg);
    }
}

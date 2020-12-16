package se221.assignment;

public class DemoShipment {

    public static void main(String[] args) {

        Shipment shipment1 = new Shipment(10,20,15,10.0,343.65);
        Shipment shipment2 = new Shipment(2,3,4,0.76,233.75);

        double vol;

        vol = shipment1.volume();
        System.out.println("Volume of shipment1 from Chittagong to Vancouver is "+ vol);
        System.out.println("Weight of shipment1 from Chittagong to Vancouver is "+ shipment1.weight);
        System.out.println("Shipping cost from Chittagong to Vancouver: $"+ shipment1.shipcost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of shipment2 from Dhaka to Netherlands is "+ vol);
        System.out.println("Weight of shipment2 from Dhaka to Netherlands is "+ shipment2.weight);
        System.out.println("Cargo cost from Dhaka to Netherlands is: $"+ shipment2.shipcost);
        System.out.println();
    }
}

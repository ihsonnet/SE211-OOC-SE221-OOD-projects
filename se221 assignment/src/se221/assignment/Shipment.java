package se221.assignment;

class Shipment extends BoxWeight {
    double shipcost;

    Shipment(Shipment ob) {
        super(ob);
        shipcost = ob.shipcost;
    }

    Shipment(double w, double h, double d, double m, double cost) {
        super(w,h,d,m);
        shipcost = cost;
    }

    Shipment() {
        super();
        shipcost = -1;
    }

    Shipment(double len, double m, double cost) {
        super(len, m);
        shipcost = cost;
    }
}

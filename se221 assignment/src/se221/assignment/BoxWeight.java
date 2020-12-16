package se221.assignment;


class BoxWeight extends Box {
    double weight; //data member

    BoxWeight(BoxWeight ob) {   // pass object to constructor
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

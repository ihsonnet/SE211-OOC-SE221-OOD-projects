package com.supplyMS;

import java.util.ArrayList;

public class PrimiumProduct extends Product{

    private ArrayList<Product> productsList;

    public PrimiumProduct(int pId, String title, Long price) {
        super(pId, title, price, "Primium");
    }
}

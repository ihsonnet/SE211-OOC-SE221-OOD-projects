package com.supplyMS;

public class NormalProduct extends Product{
    public NormalProduct(int pId, String title, Long price, String productType) {
        super(pId, title, price, "Normal");
    }
}

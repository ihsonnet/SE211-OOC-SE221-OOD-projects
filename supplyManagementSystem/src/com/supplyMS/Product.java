package com.supplyMS;

public class Product {
    protected int pId;
    protected String title;
    protected Long price;
    protected String productType;

    public void buyProduct(int pId, Long price, int quantity){
        System.out.println("\n------INVOICE------\n\nProduct ID: "+pId+"\nTotal Price: "+quantity*price);
    }

    public Product() {
    }

    public Product(int pId, String title, Long price, String productType) {
        this.pId = pId;
        this.title = title;
        this.price = price;
        this.productType = productType;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}

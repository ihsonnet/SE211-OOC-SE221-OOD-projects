package com.daffodilwater;

public class FactorySupervisor {
    private String name;
    private int id;
    public FactorySupervisor(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void supervise(RegCustomer arr[], int r){
        for(int i = 0;i < r;i++){
            if(arr[i].getTotalOrderedAmount() > 5000){
                System.out.println("\n" +arr[i].getName()+ " got 10% discount");
            }else{
                System.out.println(arr[i].getName() + " got no discount");
            }
        }
    }
}

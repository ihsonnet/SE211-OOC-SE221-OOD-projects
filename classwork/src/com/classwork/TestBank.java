package com.classwork;

public class TestBank {

    public static void main(String[] args) {
        AgraniBank a = new AgraniBank();
        PubaliBank p = new PubaliBank();
        DutchBanglaBank d = new DutchBanglaBank();
        StandardCharteredBank s = new StandardCharteredBank();

        System.out.println("Agrani Bank: Rate of Interest: "+ a.GetRateOfInterest());
        System.out.println("Pubali Bank: Rate of Interest: "+ p.GetRateOfInterest());
        System.out.println("Dutch Bangla Bank: Rate of Interest: "+ d.GetRateOfInterest());
        System.out.println("Standard Chartered Bank: Rate of Interest: "+ s.GetRateOfInterest());
    }
}

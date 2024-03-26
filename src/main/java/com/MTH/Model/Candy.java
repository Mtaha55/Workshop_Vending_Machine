package com.MTH.Model;

public class Candy extends Product {
    private String flavor;

    public Candy(int id, double price, String productName, String flavor) {
        super(id, price, productName);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String examine() {
        return "Candy: " + getProductName() + ", Flavor: " + flavor + ", Price: $" + getPrice();
    }

    @Override
    public String use() {
        return "Enjoy your " + getProductName() + "!";
    }
}

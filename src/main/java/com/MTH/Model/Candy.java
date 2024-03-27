package com.MTH.Model;

public class Candy extends Product {
    private String flavor;

    public Candy(double price, double v, String productName, String flavor) {
        super(price, productName);
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
        return "Id - " + getId() +"Candy: " + getProductName() + ", Flavor: " + flavor + ", Price: $" + getPrice();
    }

    @Override
    public String use() {
        return "Enjoy your " + getProductName() + "!";
    }
}

package com.MTH.Model;

public class Drink extends Product {
    private String brand;

    public Drink(int id, double price, String productName, String brand) {
        super(id, productName);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String examine() {
        return "Drink: " + super.getProductName() + ", Brand: " + brand + ", Price: $" + super.getPrice();
    }

    @Override
    public String use() {
        return "Enjoy your " + super.getProductName() + "!";
    }
}
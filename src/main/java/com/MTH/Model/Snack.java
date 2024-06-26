package com.MTH.Model;


public class Snack extends Product {
    private int calories;

    public Snack(double price, String productName, double v, int calories) {
        super(price, productName);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String examine() {
        return "Snack: " + getProductName() + ", Calories: " + calories + ", Price: $" + getPrice();
    }

    @Override
    public String use() {
        return "Enjoy your " + getProductName() + "!";
    }
}

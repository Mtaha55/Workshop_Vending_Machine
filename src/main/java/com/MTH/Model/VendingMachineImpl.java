package com.MTH.Model;

public class VendingMachineImpl implements VendingMachine {
    private final Product[] products;
    private int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
        this.depositPool = 0;
    }

    @Override
    public void addCurrency(int amount) {
        this.depositPool += amount;
    }

    @Override
    public int getBalance() {
        return this.depositPool;
    }

    @Override
    public int endSession() {
        int change = this.depositPool;
        this.depositPool = 0;
        return change;
    }

    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product.getProductName();
            }
        }
        return "Product not found";
    }

    @Override
    public String[] getProduct() {
        String[] productNames = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productNames[i] = products[i].getProductName();
        }
        return productNames;
    }
}

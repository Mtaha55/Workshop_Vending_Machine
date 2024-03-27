package com.MTH.Model;

public interface VendingMachine {
    void addCurrency(int amount);
    int getBalance();
    int endSession();
    String getDescription(int id);
    String[] getProduct();
}

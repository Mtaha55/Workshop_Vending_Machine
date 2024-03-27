package com.MTH;
import com.MTH.Model.Candy;
import com.MTH.Model.Snack;
import com.MTH.Model.Drink;
import com.MTH.Model.VendingMachine;
import com.MTH.Model.VendingMachineImpl;
import com.MTH.Model.Product;


public class VendingMachineApp {
    public static void main(String[] args) {
        // Create instances of products
        Candy candy = new Candy(1, 1.5, "Chocolate Bar", "Milk Chocolate");
        Snack snack = new Snack(2, "Potato Chips", 2.0, 150); // Corrected order of parameters
        Drink drink = new Drink(3, 1.0, "Soda", "Coca-Cola");

        // Create an array of products
        Product[] products = { candy, snack, drink };

        // Create an instance of VendingMachineImpl
        VendingMachine vendingMachine = new VendingMachineImpl(products);

        // Interact with the vending machine
        vendingMachine.addCurrency(15);
        System.out.println("Current balance: Skr" + vendingMachine.getBalance());

        String[] productNames = vendingMachine.getProduct();
        System.out.println("Available products:");
        for (String productName : productNames) {
            System.out.println(productName);
        }

        System.out.println("Description of product with ID 2: " + vendingMachine.getDescription(2));

        int change = vendingMachine.endSession();
        System.out.println("Returned change: Skr" + change);
    }
}
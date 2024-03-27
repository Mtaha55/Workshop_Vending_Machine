package com.MTH;
import com.MTH.Model.Candy;
import com.MTH.Model.Snack;


public class VendingMachineApp {
    public static void main(String[] args) {
        // Creating instances of different products
        Candy candy = new Candy(1.5, "Chocolate Bar", "Milk Chocolate");
        Snack snack = new Snack( 2.0, "Potato Chips", 150);


        // Examining products
        System.out.println(candy.examine());
        System.out.println(snack.examine());


        // Using products
        System.out.println(candy.use());
        System.out.println(snack.use());

    }
}

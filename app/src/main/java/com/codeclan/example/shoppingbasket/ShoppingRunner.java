package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 12/06/2017.
 */

public class ShoppingRunner {

    public static void main(String[] args) {

        // Mike's Shopping Basket
        // Loyalty and 3 goods with 2 for 1
        ShoppingBasket basketMike = new ShoppingBasket("Mike");
        Item item1 = new Item("Cornflakes", 15, 2, true);
        Integer itemID1 = 100;
        basketMike.addItem(itemID1, item1);
        Item item2 = new Item("Rice Crispies", 10, 3, false);
        Integer itemID2 = 101;
        basketMike.addItem(itemID2, item2);
        Item item3 = new Item("Chicken", 15, 2, true);
        Integer itemID3 = 102;
        basketMike.addItem(itemID3, item3);
        Item item4 = new Item("Bread", 3, 2, true);
        Integer itemID4 = 103;
        basketMike.addItem(itemID4, item4);
        // Calculate basket value with:
        // -10% over £20
        // -2% if loyalty
        double basketValueMike = basketMike.getBasketValue();
        String custName1 = basketMike.getCustomerName();
        System.out.println(custName1 + "'s basket value is: " + basketValueMike);

        // Bob's shopping basket
        // No Loyalty and no 2 for 1's
        ShoppingBasket basketBob = new ShoppingBasket("Bob");
        Item item5 = new Item("Wraps", 6, 3, false);
        Integer itemID5 = 104;
        basketBob.addItem(itemID5, item5);
        Item item6 = new Item("Potatoes", 5, 1, false);
        Integer itemID6 = 105;
        basketBob.addItem(itemID6, item6);
        Item item7 = new Item("Chicken", 15, 2, false);
        Integer itemID7 = 102;
        basketBob.addItem(itemID7, item7);
        Item item8 = new Item("Bread", 3, 2, false);
        Integer itemID8 = 103;
        basketBob.addItem(itemID8, item8);
        // Calculate basket value with:
        // -10% over £20 only
        double basketValueBob = basketBob.getBasketValue();
        String custName2 = basketBob.getCustomerName();
        System.out.println(custName2 + "'s basket value is: " + basketValueBob);

    }

}

package com.codeclan.example.shoppingbasket;

import android.content.SharedPreferences;

import java.io.ByteArrayInputStream;
import java.util.HashMap;

/**
 * Created by user on 10/06/2017.
 */

public class ShoppingBasket implements Shoppable{

    private String customerName;
    private Integer itemId;
    private double basketValue;
    private int itemValue;

    HashMap<Integer, Item> basket = new HashMap<Integer, Item>();
    Customer customer = new Customer(customerName);
    Item itemOne = new Item("Cornflakes", 3, 2, true);

    public ShoppingBasket(String customerName) {
        this.customerName = customerName;
        this.itemId = itemId;
    }

    public void addItem(Integer itemId, Item item) {
        basket.put(itemId, item);
    }

    public void removeItem(Integer itemId) {
        basket.remove(itemId);
    }

    public void emptyBasket() {
        basket.clear();
    }

    public int getBasketSize() {
        int sizeBasket = basket.size();
        return sizeBasket;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String newCustomerName) {
        this.customerName = newCustomerName;
    }

    public boolean getCustomerLoyalty() {
        boolean customerLoyalty = customer.getLoyalty(customerName);
        return customerLoyalty;
    }

    public boolean getItemTwoForOneOffer(Item item) {
        boolean itemOffer = item.getTwoForOneOffer();
        return itemOffer;
    }

    public HashMap<Integer, Item> getBasket() {
        return basket;
    }

    public double getBasketValue() {
        for (Item item : basket.values()) {

            if (item.getQuantity() == 2 && item.getTwoForOneOffer() == true) {
                itemValue = item.getPrice();
            } else {
                itemValue = item.getPrice() * item.getQuantity();
            }
            basketValue = basketValue + itemValue;
        }

        // 10% off for basket > 20
        if (basketValue > 20) {
            basketValue = 0.9 * basketValue;
        }

        // 2% off if customer loyalty
        if (getCustomerLoyalty() == true) {
            basketValue = 0.98 * basketValue;
        }
        return basketValue;
    }

}

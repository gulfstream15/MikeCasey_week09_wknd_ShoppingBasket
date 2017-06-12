package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 10/06/2017.
 */

public class Item {

    private String name;
    private int price;
    private int quantity;
    private boolean twoForOneoffer;

    public Item(String name, int price, int quantity, boolean twoForOneoffer) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.twoForOneoffer = twoForOneoffer;
    }

    public String getName() {
            return this.name;
        }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;

    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;

    }

    public boolean getTwoForOneOffer() {
        return this.twoForOneoffer;
    }

    public void SetTwoForOneOffer(boolean newOffer) {
        this.twoForOneoffer = newOffer;
    }
}

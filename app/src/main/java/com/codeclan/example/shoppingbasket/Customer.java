package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 10/06/2017.
 */

public class Customer {

    private String customerName;
    private Boolean loyalty;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.loyalty = loyalty;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String newCustomerName) {
        this.customerName = newCustomerName;
    }

    public boolean getLoyalty(String customerName) {
        switch (customerName) {
            case "Mike":
                loyalty = true;
                break;
            case "Bob":
                loyalty = false;
        }
        return loyalty;
    }

}

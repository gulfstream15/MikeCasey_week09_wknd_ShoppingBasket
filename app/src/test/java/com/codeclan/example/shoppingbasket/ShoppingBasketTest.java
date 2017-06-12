package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 09/06/2017.
 */

public class ShoppingBasketTest {

    @Before
    public void before(){
        ShoppingBasket shoppingBasket = new ShoppingBasket("Mike");
    }

    @Test
    public void basketHasCustomer() {
        ShoppingBasket basket = new ShoppingBasket("Mike");
        String basketCustomer = basket.getCustomerName();
        assertEquals("Mike", basketCustomer);
    }

    @Test
    public void canAddItem() {
        ShoppingBasket basket = new ShoppingBasket("Mike");
        Item item = new Item("Cornflakes", 3, 1, true);
        Integer itemId = 100;
        basket.addItem(itemId,item);
        int sizeBasket = basket.getBasketSize();
        assertEquals(1, sizeBasket);
    }

    @Test
    public void canRemoveItem() {
        ShoppingBasket basket = new ShoppingBasket("Mike");
        Item itemOne = new Item("Cornflakes", 3, 2, true);
        Integer itemIdOne = 100;
        basket.addItem(itemIdOne, itemOne);
        Item itemTwo = new Item("Rice Crispies", 2, 1, true);
        Integer itemIdTwo = 101;
        basket.addItem(itemIdTwo, itemTwo);
        basket.removeItem(itemIdTwo);
        assertEquals(1, basket.getBasketSize());
    }

    @Test
    public void canEmptyBasket() {
        ShoppingBasket basket = new ShoppingBasket("Mike");
        Item itemOne = new Item("Cornflakes", 3, 2, true);
        Integer itemIdOne = 100;
        basket.addItem(itemIdOne, itemOne);
        basket.emptyBasket();
        assertEquals(0, basket.getBasketSize());
    }

    @Test
    public void basketHasItems() {
        ShoppingBasket basket = new ShoppingBasket("Mike");
        Item itemOne = new Item("Cornflakes", 3, 2, true);
        Integer itemIdOne = 100;
        basket.addItem(itemIdOne, itemOne);
        int basketSize = basket.getBasketSize();
        assertEquals(1, basketSize);
    }

    @Test
    public void customerHasLoyalty() {
        ShoppingBasket basket = new ShoppingBasket("Mike");
        String customerName = basket.getCustomerName();
        Customer customer = new Customer(customerName);
        boolean customerLoyalty = customer.getLoyalty(customerName);
        assertEquals(true, customerLoyalty);
    }

    @Test
    public void customerHasNoLoyalty() {
        ShoppingBasket basket = new ShoppingBasket("Bob");
        String customerName = basket.getCustomerName();
        Customer customer = new Customer(customerName);
        boolean customerLoyalty = customer.getLoyalty(customerName);
        assertEquals(false, customerLoyalty);
    }

    @Test
    public void itemHasTwoForOneOffer() {
        ShoppingBasket basket = new ShoppingBasket("Mike");
        Item itemOne = new Item("Cornflakes", 3, 2, true);
        boolean itemOffer = basket.getItemTwoForOneOffer(itemOne);
        assertEquals(true, itemOffer);
    }

    @Test
    public void itemNoTwoForOneOffer() {
        ShoppingBasket basket = new ShoppingBasket("Mike");
        Item itemOne = new Item("Porridge", 4, 1, false);
        boolean itemOffer = basket.getItemTwoForOneOffer(itemOne);
        assertEquals(false, itemOffer);
    }

    @Test
    public void BasketWithTwoForOneAndLoyalty() {
        ShoppingBasket basket = new ShoppingBasket("Mike");
        Item itemOne = new Item("Cornflakes", 15, 2, true);
        Integer itemIdOne = 100;
        basket.addItem(itemIdOne, itemOne);
        Item itemTwo = new Item("Rice Crispies", 10, 2, false);
        Integer itemIdTwo = 101;
        basket.addItem(itemIdTwo, itemTwo);
        double basketValue = basket.getBasketValue();
        assertEquals(30.87, basketValue, 0.0);
    }

    @Test
    public void BasketWithTwoForOneAndNoLoyalty() {
        ShoppingBasket basket = new ShoppingBasket("Bob");
        Item itemOne = new Item("Cornflakes", 15, 2, true);
        Integer itemIdOne = 100;
        basket.addItem(itemIdOne, itemOne);
        Item itemTwo = new Item("Rice Crispies", 10, 2, false);
        Integer itemIdTwo = 101;
        basket.addItem(itemIdTwo, itemTwo);
        double basketValue = basket.getBasketValue();
        assertEquals(31.50, basketValue, 0.0);
    }

    @Test
    public void BasketNoTwoForOneAndLoyalty() {
        ShoppingBasket basket = new ShoppingBasket("Mike");
        Item itemOne = new Item("Cornflakes", 15, 2, false);
        Integer itemIdOne = 100;
        basket.addItem(itemIdOne, itemOne);
        Item itemTwo = new Item("Rice Crispies", 10, 2, false);
        Integer itemIdTwo = 101;
        basket.addItem(itemIdTwo, itemTwo);
        double basketValue = basket.getBasketValue();
        assertEquals(44.1, basketValue, 0.0);
    }

    @Test
    public void BasketNoTwoForOneAndNoLoyalty() {
        ShoppingBasket basket = new ShoppingBasket("Bob");
        Item itemOne = new Item("Cornflakes", 15, 2, false);
        Integer itemIdOne = 100;
        basket.addItem(itemIdOne, itemOne);
        Item itemTwo = new Item("Rice Crispies", 10, 2, false);
        Integer itemIdTwo = 101;
        basket.addItem(itemIdTwo, itemTwo);
        double basketValue = basket.getBasketValue();
        assertEquals(45.0, basketValue, 0.0);
    }

}

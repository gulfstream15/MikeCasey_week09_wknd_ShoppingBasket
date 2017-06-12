package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/06/2017.
 */

public class ItemTest {

    Item item;

    @Before
    public void before(){
        item = new Item("Cornflakes", 3, 2, false);
    }

    @Test
    public void hasName() {
        item = new Item("Cornflakes", 3, 2, false);
        assertEquals("Cornflakes", item.getName());
    }

    @Test
    public void hasPrice() {
        item = new Item("Cornflakes", 3, 2, false);
        assertEquals(3, item.getPrice());
    }

    @Test
    public void hasQuantity() {
        item = new Item("Cornflakes", 3, 2, false);
        assertEquals(2, item.getQuantity());
    }

    @Test
    public void hasNoOffer() {
        item = new Item("Cornflakes", 3, 2, false);
        assertEquals(false, item.getTwoForOneOffer());
    }

    @Test
    public void hasOffer() {
        item = new Item("Cornflakes", 3, 2, true);
        assertEquals(true, item.getTwoForOneOffer());
    }


}

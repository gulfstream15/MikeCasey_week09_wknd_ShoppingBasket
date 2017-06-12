package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/06/2017.
 */

public class CustomerTest {

    @Before
    public void before(){
        Customer customer = new Customer("Mike");
    }

    @Test
    public void hasName() {
        Customer customer = new Customer("Mike");
        assertEquals("Mike", customer.getCustomerName());
    }

    @Test
    public void customerHasLoyalty() {
        Customer customer = new Customer("Mike");
        assertEquals(true, customer.getLoyalty("Mike"));
    }

    @Test
    public void customerNoLoyalty() {
        Customer customer = new Customer("Bob");
        assertEquals(false, customer.getLoyalty("Bob"));
    }

}

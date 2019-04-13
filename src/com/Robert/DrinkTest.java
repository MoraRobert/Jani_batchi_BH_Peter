package com.Robert;

import org.junit.Test;

import static org.junit.Assert.*;

public class DrinkTest {

    @Test
    public void containsAlcohol() {

        //fail("This test has yet to be implemented");
        Drink testDrink = new Drink(5, 1);
        double level = testDrink.containsAlcohol();

        assertEquals(0.4,level,0.001);
    }
}
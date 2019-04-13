package com.Robert;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @org.junit.Test
    public void getDrinkWithLowestAlcoholContent() {

        Drink[] testDrinkArray = {  (new Drink(8,3.7)),
                                    (new Drink(10,5)),
                                    (new Drink(2,1)),
                                    (new Drink(5,5)),
                                    (new Drink(6,0)),
                                    (new Drink(4,1)),
                                    (new Drink(3,1.5)),
                                    (new Drink(7,5.9)),
                                    (new Drink(9,2))};

        double lowestDrinkSize = Utils.getDrinkWithLowestAlcoholContent(testDrinkArray).getDrinkSize();
        double lowestDrinkSoda = Utils.getDrinkWithLowestAlcoholContent(testDrinkArray).getSoda();

        assertEquals(5, lowestDrinkSize,0.001);
        assertEquals(5,lowestDrinkSoda, 0.001);

    }

    @Test
    public void getYoungestPerson() {
    }
}
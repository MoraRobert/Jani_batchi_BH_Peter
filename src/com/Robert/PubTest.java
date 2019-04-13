package com.Robert;

import static org.junit.Assert.*;

public class PubTest {

    @org.junit.Test //(expected = QuantityExeption.class)
    public void serveDrinkToPerson() throws QuantityExeption, TooMuchAlcoholException, DebitException, UnderageException {
        Pub testPub1 = new Pub(800, 900);
        Person testPerson1 = new Person(20, 100000, 0);
        Drink testDrink1 = new Drink(5, 2.5);
        testPub1.serveDrinkToPerson(testPerson1, testDrink1);
        //assertTrue(test1);

//        Drink testDrink2 = new Drink(1000, 950, 50);
//        boolean test2 = testPub1.serveDrinkToPerson(testPerson1, testDrink2);
//        assertFalse(test2);

//        Person testPerson3 = new Person(17, 100, 50);
//        boolean test3 = testPub1.serveDrinkToPerson(testPerson3, testDrink1);
//        assertFalse(test3);

    }

    @org.junit.Test
    public void getWineQuantity() {
    }

    @org.junit.Test
    public void getSodaQuantity() {
    }

    @org.junit.Test
    public void testToString() {

        Pub testPub = new Pub(80,500);
        String testString = "Pub{" +
                "wineQuantity=" + testPub.getWineQuantity() +
                ", sodaQuantity=" + testPub.getSodaQuantity() +
                '}';
        assertEquals(testString,testPub.toString());
    }
}
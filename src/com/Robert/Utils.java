package com.Robert;

public class Utils {

    public static Drink getDrinkWithLowestAlcoholContent(Drink[] array) {
        double min = Double.MAX_VALUE;
        Drink lowestDrink = null;

        for (Drink drink : array) {
            if (drink.containsAlcohol() < min) {
                lowestDrink = drink;
                min = lowestDrink.containsAlcohol();
            }
        }

        return lowestDrink;
    }

    public static Person getYoungestPerson(Person[] arr) {
        int min = Integer.MAX_VALUE;
        Person youngestPerson = null;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < min) {
                youngestPerson = arr[i];
                min = youngestPerson.getAge();
            }
        }
        return youngestPerson;
    }

}

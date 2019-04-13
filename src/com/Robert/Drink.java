package com.Robert;

public class Drink  {

    double drinkSize;
    double soda;
    double wine;

    public Drink(double drinkSize, double soda, double wine) {
        this.drinkSize = drinkSize;
        this.soda = soda;
        this.wine = wine;
    }

    public Drink(double drinkSize, double soda) {
        this(drinkSize, soda, (drinkSize - soda));
    }

    public double containsAlcohol() {
        return (this.wine * 0.1);
    }

    public double getDrinkSize() {
        return this.drinkSize;
    }

    public double getSoda() {
        return this.soda;
    }

    public double getWine() {
        return this.wine;
    }

    @Override
    public String toString() {
        String name;

        if(this.wine == 0) {
            name = "soda";
        } else if (this.soda == 0) {
            name = "wine";
        } else {
            name = "froetch";
        }

        return "The size of the drink is: " + this.drinkSize + " dl." +
                " It has got " + this.soda + " dl soda in it. " +
                "It has got " + this.wine + " dl wine in it. " + "It is called: " + name;
    }
}

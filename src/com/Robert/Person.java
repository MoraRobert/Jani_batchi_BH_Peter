package com.Robert;


public class Person {

    int age;
    double funds;
    double consumed;

    /**
     *
     * @param age
     * @param funds
     * @param consumed is in milileters.
     *                 Wine is calculated in dl, 1 dl = 100 ml
     *                 each 1 dl of wine contains 0.1 dl of alcohol so @parameter consumed rises with 10 (ml)
     */
    public Person(int age, double funds, double consumed) {
        this.age = age;
        this.funds = funds;
        this.consumed = consumed;
    }

    public int getAge() {
        return age;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public double getConsumed() {
        return consumed;
    }

    public void setConsumed(double consumed) {
        this.consumed = consumed;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", funds=" + funds +
                ", consumed=" + consumed +
                '}';
    }
}

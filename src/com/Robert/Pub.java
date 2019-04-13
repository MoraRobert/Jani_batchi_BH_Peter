package com.Robert;

public class Pub {

    private int wineQuantity;   // calculated in dl
    private int sodaQuantity;   // calculated in dl

    public Pub(int wineQuantity, int sodaQuantity) {
        this.wineQuantity = wineQuantity;
        this.sodaQuantity = sodaQuantity;
    }

    public void serveDrinkToPerson(Person customer, Drink customersDrink) throws UnderageException, TooMuchAlcoholException, QuantityExeption, DebitException {

        if((customer.getAge() < 18 /*|| customer.getConsumed() >= 40*/) && customersDrink.getWine() != 0) {
            throw new UnderageException();
        }

        if( customer.getConsumed() >= 40 && customersDrink.getWine() != 0) {
            throw new TooMuchAlcoholException(40);
        }

        if(this.sodaQuantity < customersDrink.getSoda() || this.wineQuantity < customersDrink.getWine()) {
            throw new QuantityExeption();
        }


        if(customer.getFunds() < customersDrink.getSoda() * 50 + customersDrink.getWine() * 300) {
            throw new DebitException();
        }

        this.wineQuantity -= customersDrink.getWine();
        this.sodaQuantity -= customersDrink.getSoda();
        customer.setConsumed(customer.getConsumed() + customersDrink.containsAlcohol()*100);
        double drinkPrice = customersDrink.getWine() * 300 + customersDrink.getSoda() * 50;
        customer.setFunds(customer.getFunds() - drinkPrice);
    }

    public int getWineQuantity() {
        return wineQuantity;
    }

    public int getSodaQuantity() {
        return sodaQuantity;
    }

    @Override
    public String toString() {
        return "Pub{" +
                "wineQuantity=" + wineQuantity +
                ", sodaQuantity=" + sodaQuantity +
                '}';
    }
}

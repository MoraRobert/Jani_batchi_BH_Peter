package com.Robert;

public class QuantityExeption extends Exception {

    public QuantityExeption() {
        super("there's not enough raw meterial on stock, so the customer can not be served");
    }

}

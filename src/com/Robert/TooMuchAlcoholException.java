package com.Robert;

public class TooMuchAlcoholException extends Exception {

    public TooMuchAlcoholException(int quantity) {
        super("the customer already consumed " + quantity + " ml alcohol, so can not be served with alcohol");
    }
}

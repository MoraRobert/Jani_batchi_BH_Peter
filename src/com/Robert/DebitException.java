package com.Robert;

public class DebitException extends Exception {

    public DebitException() {
        super("the customer hasn't got enough money for their drink, so they can not be served");
    }

}

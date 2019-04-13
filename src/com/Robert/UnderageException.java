package com.Robert;

public class UnderageException extends Exception {
    // Constructor that accepts a message
    public UnderageException()
    {

        super("the customer is underage, so can not be served with alcohol");
    }
}

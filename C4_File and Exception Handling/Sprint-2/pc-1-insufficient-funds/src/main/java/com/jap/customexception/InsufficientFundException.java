package com.jap.customexception;

public class InsufficientFundException extends Exception {

     InsufficientFundException(String message) {
        super(message);
    }

}

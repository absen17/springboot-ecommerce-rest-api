package com.abs.springboot_transaction.exception;

public class PaymentException extends RuntimeException{
    public PaymentException(String message){
        super(message);
    }
}

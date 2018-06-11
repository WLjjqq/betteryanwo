package com.betteryanwo.exception;

/**
 * Create by 六
 * Date:18-6-7
 */
public class OrderException extends RuntimeException{
    public OrderException(){
        super();
    }

    public OrderException(String message){
        super(message);
    }

    public OrderException(String message, Throwable cause){
        super(message, cause);
    }
}

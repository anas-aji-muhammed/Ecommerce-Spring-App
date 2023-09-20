package com.anasajimuhammed.ecommercebackend.utils;

/**
 * This class is responsible for providing a consistent API response structure.
 * **/
public class ApiResponseGeneric<T>  {
    private String message;
    private T body;

    public ApiResponseGeneric(String message, T body) {
        this.message = message;
        this.body = body;
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}

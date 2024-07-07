package com.SpringBootWeb.FirstSpringApplication.exceptions;


public class ResourceNotFoundException extends  RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}

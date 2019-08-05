package com.dbs.dbsapp.exceptions;


public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String customizedMessage){
        super(customizedMessage);
    }
}

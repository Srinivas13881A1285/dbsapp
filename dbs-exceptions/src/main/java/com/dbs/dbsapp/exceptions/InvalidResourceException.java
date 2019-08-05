package com.dbs.dbsapp.exceptions;

public class InvalidResourceException extends RuntimeException {
    public InvalidResourceException(String customizedMessage) {
        super(customizedMessage);
    }
}

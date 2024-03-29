package com.dbs.dbsapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UploadFileException extends RuntimeException {
    public UploadFileException(String message) {
        super(message);
    }

    public UploadFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
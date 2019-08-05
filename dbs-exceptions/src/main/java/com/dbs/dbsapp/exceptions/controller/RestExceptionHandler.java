package com.dbs.dbsapp.exceptions.controller;

import com.dbs.dbsapp.exceptions.InvalidResourceException;
import com.dbs.dbsapp.exceptions.ResourceNotFoundException;
import com.dbs.dbsapp.exceptions.model.ApiError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiError> handleEntityNotFound(ResourceNotFoundException ud) {
        logger.info("entered into handleEntityNotFound method");
        ApiError apiError = ApiError.apiErrorResponse().withStatus(HttpStatus.NOT_FOUND).withTimeStamp(LocalDateTime.now()).
                withMessage(ud.getMessage());
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InvalidResourceException.class)
    protected ResponseEntity<ApiError> handleInvalidResource(InvalidResourceException ex) {
        logger.info("entered into handleMethodArguemntNotValid");
        ApiError apiError = ApiError.apiErrorResponse().withStatus(HttpStatus.BAD_REQUEST).withTimeStamp(LocalDateTime.now()).
                withMessage(ex.getMessage());
        return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
    }
}

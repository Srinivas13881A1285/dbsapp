package com.dbs.dbsapp.exceptions.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

public class ApiError {
    @JsonFormat
    private HttpStatus status;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    @JsonFormat
    private String message;
    @JsonFormat
    private String debugMessage;
    @JsonFormat
    private List<ApiSubError> subErrors;

    private ApiError() {
    }

    public static ApiError apiErrorResponse() {
        return new ApiError();
    }

    public ApiError withTimeStamp(LocalDateTime localDateTime) {
        this.timestamp = localDateTime;
        return this;
    }

    public ApiError withStatus(HttpStatus status) {
        this.status = status;
        return this;
    }

    public ApiError withMessage(String message) {
        this.message = message;
        return this;
    }

    public ApiError withDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
        return this;
    }

    public ApiError withSubErrors(List<ApiSubError> subErrors) {
        this.subErrors = subErrors;
        return this;
    }

   /* public ApiError build() {
        ApiError apiError = new ApiError();
        apiError.status = this.status;
        apiError.timestamp = this.timestamp;
        apiError.message = this.message;
        apiError.debugMessage = this.debugMessage;
        apiError.subErrors = this.subErrors;
        return apiError;
    }*/

    @Override
    public String toString() {
        return "ApiError{" + "status=" + status + ", timestamp=" + timestamp + ", message='" + message + '\'' + ", debugMessage='" + debugMessage + '\'' + ", subErrors=" + subErrors + '}';
    }
}

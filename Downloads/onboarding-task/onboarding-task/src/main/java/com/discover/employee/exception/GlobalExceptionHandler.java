package com.discover.employee.exception;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class GlobalExceptionHandler {

    private static final Logger LOGGER =

            LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)

    public ResponseEntity<String> handleException(Exception ex) {

        LOGGER.error("Exception occurred", ex);

        return ResponseEntity

                .internalServerError()

                .body(ex.getMessage());

    }

}

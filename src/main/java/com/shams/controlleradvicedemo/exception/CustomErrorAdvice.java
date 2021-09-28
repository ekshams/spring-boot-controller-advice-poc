package com.shams.controlleradvicedemo.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.ZonedDateTime;

@ControllerAdvice
@Slf4j
public class CustomErrorAdvice {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(OrderNotFoundException.class)
    public ResponseEntity<ErrorResponse> handle(OrderNotFoundException e) {
        System.out.println("OrderNotFoundException handler");
//        log.error("Order not found");
        ZonedDateTime nowUtc = ZonedDateTime.now();
        System.out.println("nowUtc = " + nowUtc);

        ErrorResponse errorResponse = new ErrorResponse(nowUtc,"404", "1000", "Not found", "Order not found");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
}

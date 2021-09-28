package com.shams.controlleradvicedemo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private ZonedDateTime timestamp;
    private String status;
    private String code;
    private String title;
    private String details;
}

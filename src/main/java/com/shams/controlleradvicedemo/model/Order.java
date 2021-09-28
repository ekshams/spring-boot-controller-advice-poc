package com.shams.controlleradvicedemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Order {
    private int orderId;
    private String name;
    private Date date;
}

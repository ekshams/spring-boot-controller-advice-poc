package com.shams.controlleradvicedemo.controller;

import com.shams.controlleradvicedemo.model.Order;
import com.shams.controlleradvicedemo.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    IOrdersService iOrdersService;

    @GetMapping("")
    public List<Order> fetchOrders() {
        return iOrdersService.getOrders();
    }
}

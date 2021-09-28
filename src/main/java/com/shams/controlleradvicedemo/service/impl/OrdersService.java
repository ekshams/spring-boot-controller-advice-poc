package com.shams.controlleradvicedemo.service.impl;

import com.shams.controlleradvicedemo.exception.OrderNotFoundException;
import com.shams.controlleradvicedemo.model.Order;
import com.shams.controlleradvicedemo.service.IOrdersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService implements IOrdersService {
    @Override
    public List<Order> getOrders() {
//        return List.of(new Order(1001, "Mobile", new Date()), new Order(1002, "Laptop", new Date()));
        throw new OrderNotFoundException("Order not found");
    }
}

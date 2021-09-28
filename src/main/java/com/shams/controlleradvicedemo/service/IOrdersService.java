package com.shams.controlleradvicedemo.service;

import com.shams.controlleradvicedemo.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOrdersService {
    List<Order> getOrders();
}

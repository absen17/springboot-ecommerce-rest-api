package com.abs.springboot_transaction.service;

import com.abs.springboot_transaction.dto.OrderRequest;
import com.abs.springboot_transaction.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}

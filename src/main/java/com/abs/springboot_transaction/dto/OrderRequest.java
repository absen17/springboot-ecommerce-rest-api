package com.abs.springboot_transaction.dto;

import com.abs.springboot_transaction.entity.Order;
import com.abs.springboot_transaction.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}

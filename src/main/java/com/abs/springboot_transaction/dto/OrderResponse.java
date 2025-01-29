package com.abs.springboot_transaction.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponse {
    private String orderTrackingNumber;
    private String status;
    private String message;
}

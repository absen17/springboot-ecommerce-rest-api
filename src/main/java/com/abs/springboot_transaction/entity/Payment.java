package com.abs.springboot_transaction.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String cardName;
    private String cardNumber;
    private int expiryYear;
    private int expiryMonth;
    private int cvc;
    private Long orderId;
}

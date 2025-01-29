package com.abs.springboot_transaction.repository;

import com.abs.springboot_transaction.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}

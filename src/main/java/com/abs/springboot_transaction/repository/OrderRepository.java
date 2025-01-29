package com.abs.springboot_transaction.repository;

import com.abs.springboot_transaction.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}

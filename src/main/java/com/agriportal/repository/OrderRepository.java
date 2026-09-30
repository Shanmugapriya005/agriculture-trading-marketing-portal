package com.agriportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agriportal.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
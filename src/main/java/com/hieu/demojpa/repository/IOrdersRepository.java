package com.hieu.demojpa.repository;

import com.hieu.demojpa.entity.OrderDetails;
import com.hieu.demojpa.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdersRepository extends JpaRepository<Orders, Long> {
}
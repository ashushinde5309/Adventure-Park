package com.smartadventurepark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartadventurepark.model.Payment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}


package com.example.hclassessment2.repository;

import com.example.hclassessment2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

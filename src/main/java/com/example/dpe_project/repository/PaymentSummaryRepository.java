package com.example.dpe_project.repository;

import com.example.dpe_project.model.PaymentSummary;
import com.example.dpe_project.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentSummaryRepository extends JpaRepository<PaymentSummary , Long> {
}

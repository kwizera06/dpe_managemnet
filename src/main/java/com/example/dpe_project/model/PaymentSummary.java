package com.example.dpe_project.model;

import jakarta.persistence.*;

@Entity
public class PaymentSummary {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private int month;

    private int total_days;

    private int total_payment;

    @ManyToOne
    @JoinColumn(name="worker_id")
    private Worker worker;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getTotal_days() {
        return total_days;
    }

    public void setTotal_days(int total_days) {
        this.total_days = total_days;
    }

    public int getTotal_payment() {
        return total_payment;
    }

    public void setTotal_payment(int total_payment) {
        this.total_payment = total_payment;
    }
}

package com.example.dpe_project.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class WorkRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int record_id;
    private Date work_date;
    private int days_worked;
    private int overtime_hours;
    private int amount_per_day;
    private int total_amount;

    @ManyToOne
    @JoinColumn(name="worker_id" )
    private Worker worker;

    public Date getWork_date() {
        return work_date;
    }

    public void setWork_date(Date work_date) {
        this.work_date = work_date;
    }

    public int getDays_worked() {
        return days_worked;
    }

    public void setDays_worked(int days_worked) {
        this.days_worked = days_worked;
    }

    public int getOvertime_hours() {
        return overtime_hours;
    }

    public void setOvertime_hours(int overtime_hours) {
        this.overtime_hours = overtime_hours;
    }

    public int getAmount_per_day() {
        return amount_per_day;
    }

    public void setAmount_per_day(int amount_per_day) {
        this.amount_per_day = amount_per_day;
    }

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }
}

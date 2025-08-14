package com.example.dpe_project.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int attendance_id;


    private Date date;

    private String status;

    @ManyToOne
    @JoinColumn(name="worker_id")
    private Worker worker;

    public String getStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

package com.example.dpe_project.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CascadeType;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;

@Entity

public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long worker_id;

    private String firstName;

    private String lastName;

    private String gender;

    private String position;

    private int phoneNumber;

    @OneToMany(mappedBy="worker")
    private List<Attendance> attendance;

    @OneToMany(mappedBy = "worker" )
    private List<WorkRecord> workRecords;

    @OneToMany(mappedBy = "worker" removeOrphanage=true)
    private List<PaymentSummary> paymentSummaries;


    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return  gender;
    }
    public String getPosition(){
        return position;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;

    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void PhoneNumber(int phoneNumber){
        this.phoneNumber =phoneNumber;
    }
}

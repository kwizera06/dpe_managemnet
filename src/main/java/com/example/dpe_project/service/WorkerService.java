package com.example.dpe_project.service;

import com.example.dpe_project.model.Worker;
import com.example.dpe_project.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository rep;

    public Worker addEmployee(Worker wo) {
        return rep.save(wo);
    }

    public response deleteEmployee(Long id){
        return rep.deleteById();
    }
}
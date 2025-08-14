package com.example.dpe_project.controller;

import com.example.dpe_project.model.Worker;
import com.example.dpe_project.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/worker")
@CrossOrigin(origins ="*" )
public class WorkerController {

    @Autowired
    private WorkerService service;

    @PostMapping("/adding")
  public Worker addWorker(@RequestBody Worker worker){

        return service.addEmployee(worker);
  }
}

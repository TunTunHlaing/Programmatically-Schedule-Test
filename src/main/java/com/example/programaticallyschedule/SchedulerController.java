package com.example.programaticallyschedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulerController {

    @Autowired
    private SchedulerService service;

    @GetMapping
    public String call(){
        service.printWithSchedule();
        return "Success";
    }

}

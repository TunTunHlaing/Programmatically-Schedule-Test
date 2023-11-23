package com.example.programaticallyschedulebeta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping()
    public String taskTesting(@RequestParam String message){
        return taskService.doTask(message);
    }
}

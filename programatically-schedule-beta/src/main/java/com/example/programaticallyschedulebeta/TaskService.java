package com.example.programaticallyschedulebeta;

import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TaskService {

    private final TaskScheduler scheduler;

    public TaskService(TaskScheduler scheduler) {
        this.scheduler = scheduler;
    }

    public String doTask(String message){
        Runnable runnable = () -> {
            System.out.println("Your message is " + message);
        };
        scheduler.schedule(runnable, Instant.now().plusSeconds(5));
        return "Success";
    }
}

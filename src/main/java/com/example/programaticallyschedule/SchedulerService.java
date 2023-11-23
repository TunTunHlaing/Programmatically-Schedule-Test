package com.example.programaticallyschedule;

import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class SchedulerService {


    private final ThreadPoolTaskScheduler scheduler;
    private final MyOneTimeTask task;

    public SchedulerService(ThreadPoolTaskScheduler scheduler, MyOneTimeTask task) {
        this.scheduler = scheduler;
        this.task = task;
    }

    public void printWithSchedule(){

        scheduler.schedule(task, Instant.now().plusSeconds(5));

    }
}

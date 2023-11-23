package com.example.programaticallyschedulebeta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@SpringBootApplication
public class ProgramaticallyScheduleBetaApplication {

    @Bean
    public TaskScheduler taskScheduler() {
        return new ThreadPoolTaskScheduler();
    }
    public static void main(String[] args) {
        SpringApplication.run(ProgramaticallyScheduleBetaApplication.class, args);
    }

}

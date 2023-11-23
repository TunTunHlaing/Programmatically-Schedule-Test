package com.example.programaticallyschedule;

import org.springframework.stereotype.Component;

@Component
public class MyOneTimeTask implements Runnable {

    @Override
    public void run() {
        System.out.println("One-time task executed!");
    }
}

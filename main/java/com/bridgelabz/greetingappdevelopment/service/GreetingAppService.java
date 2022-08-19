package com.bridgelabz.greetingappdevelopment.service;

import com.bridgelabz.greetingappdevelopment.entity.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingAppService {
    private static final  String template = "Hello %s!";
    private static final AtomicLong counter = new AtomicLong();

    public User getMessage() {
        return new User(counter.incrementAndGet(), String.format(template, "Mayur"));
    }
}

package com.bridgelabz.greetingappdevelopment.controller;

import com.bridgelabz.greetingappdevelopment.entity.NewUser;
import com.bridgelabz.greetingappdevelopment.entity.User;
import com.bridgelabz.greetingappdevelopment.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private final static String template = "Hello %s";
    private final static AtomicLong counter = new AtomicLong();

    @Autowired
    GreetingAppService greetingAppService;

    @GetMapping("/getmessage")
    public User sayHello(@RequestParam(value = "name", defaultValue = "Bridgelabz") String name) {
        return new User(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/get")
    public User sayHello() {
        return greetingAppService.getMessage();
    }

    @PostMapping("/post")
    private User sayHello(@RequestBody NewUser newUser) {
        return greetingAppService.greetingMessage(newUser);
    }
}

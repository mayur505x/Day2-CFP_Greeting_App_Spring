package com.bridgelabz.greetingappdevelopment.controller;

import com.bridgelabz.greetingappdevelopment.entity.User;
import com.bridgelabz.greetingappdevelopment.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private final static String template = "Hello %s";
    private final static AtomicLong counter = new AtomicLong();

    @Autowired
    GreetingAppService greetingAppService;;

    @RequestMapping(value = {"", "/", " "})
    public User greeting (@RequestParam(value = "name", defaultValue = "Bridgelabz") String name) {
        return new User(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/get")
    public User sayHello() {
        return greetingAppService.getMessage();
    }
}

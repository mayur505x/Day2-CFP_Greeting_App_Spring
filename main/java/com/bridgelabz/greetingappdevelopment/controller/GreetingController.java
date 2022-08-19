package com.bridgelabz.greetingappdevelopment.controller;

import com.bridgelabz.greetingappdevelopment.entity.Greeting;
import com.bridgelabz.greetingappdevelopment.entity.User;
import com.bridgelabz.greetingappdevelopment.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingAppService greetingService;

    @GetMapping(value = { "/", "create", ""})
    public Greeting greetingMessage(@RequestParam(required = false, defaultValue = "") String firstName,@RequestParam(required = false,  defaultValue = "") String lastName) {
        //  return new Greeting(counter.incrementAndGet(), String.format(template, firstName, lastName));
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/getbyid/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }

    @GetMapping("/getall")
    public List<Greeting> getAllGreeting() {
        return greetingService.getAllGreeting();
    }
}
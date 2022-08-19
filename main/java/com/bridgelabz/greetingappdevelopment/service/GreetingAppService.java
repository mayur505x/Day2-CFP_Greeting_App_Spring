package com.bridgelabz.greetingappdevelopment.service;

import com.bridgelabz.greetingappdevelopment.entity.Greeting;
import com.bridgelabz.greetingappdevelopment.entity.User;

import java.util.List;

public interface GreetingAppService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(Long id);
    List<Greeting> getAllGreeting();
}

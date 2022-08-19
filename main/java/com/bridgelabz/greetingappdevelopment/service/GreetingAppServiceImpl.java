package com.bridgelabz.greetingappdevelopment.service;

import com.bridgelabz.greetingappdevelopment.entity.NewUser;
import com.bridgelabz.greetingappdevelopment.entity.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingAppServiceImpl implements GreetingAppService {
    private static final String TEMPLATE = "Hello ,%s ";
    private static final AtomicLong count = new AtomicLong();

    @Override
    public User getMessage() {
        return new User(count.incrementAndGet(),String.format(TEMPLATE,"Mayur !!"));
    }

    @Override
    public User greetingMessage(NewUser newUser) {
        return new User (count.incrementAndGet(), String.format(TEMPLATE, newUser.getFirstName()) + newUser.getLastName());
    }
}

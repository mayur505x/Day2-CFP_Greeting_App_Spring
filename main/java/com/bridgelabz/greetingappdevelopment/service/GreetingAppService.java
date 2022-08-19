package com.bridgelabz.greetingappdevelopment.service;

import com.bridgelabz.greetingappdevelopment.entity.NewUser;
import com.bridgelabz.greetingappdevelopment.entity.User;

public interface GreetingAppService {
    User getMessage();

    User greetingMessage(NewUser newUser);
}

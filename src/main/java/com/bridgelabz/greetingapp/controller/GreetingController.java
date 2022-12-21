package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.User;
import com.bridgelabz.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @Autowired
    private IGreetingService greetingService;

    @GetMapping(value =  {"", "/"})
    public Greeting greeting(@RequestParam(value = "firstName", defaultValue = "family")String firstName,
                             @RequestParam(value = "lastName", defaultValue = "")String lastName){
                User user = new User();
                user.setFirstName(firstName);
                user.setLastName(lastName);
                return greetingService.addGreeting(user);
    }

}

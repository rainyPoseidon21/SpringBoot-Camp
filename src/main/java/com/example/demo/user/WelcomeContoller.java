package com.example.demo.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeContoller {
    
    @RequestMapping(value = "/welcome")
    public static String Welcome(){
        return "Welcome to Spring Boot Pro";
    }

    
}

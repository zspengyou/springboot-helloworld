package com.jay.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyApplication {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    String home() {
        System.out.println("MyApplication.home");
        userService.show1();
        return "Hello World!";

    }

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication((MyApplication.class));
//        springApplication.

        springApplication.run(args);


    }

}
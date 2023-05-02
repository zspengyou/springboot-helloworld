package com.jay.learning.service.impl;

import com.jay.learning.UserService;
import org.springframework.stereotype.Component;

@Component
public class MyUserServiceImpl implements UserService {
    public MyUserServiceImpl() {
        System.out.println("MyUserServiceImpl.MyUserServiceImpl");
    }

    @Override
    public void show1() {
        System.out.println("show 1");


    }

    @Override
    public void show2() {
        System.out.println("show 2");
    }
}

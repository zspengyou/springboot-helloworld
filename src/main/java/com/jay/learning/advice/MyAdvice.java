package com.jay.learning.advice;

import org.springframework.stereotype.Component;

@Component
public class MyAdvice {
    public void beforeAdvice(){
        System.out.println("MyAdvice.beforeAdvice");
    }

    public void afterAdvice() {
        System.out.println("MyAdvice.afterAdvice");
    }

}

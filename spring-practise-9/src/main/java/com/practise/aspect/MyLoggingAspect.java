package com.practise.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 16/09/2017.
 */
// TODO 036: Annotation
@Aspect
@Component
public class MyLoggingAspect {

    //add advice

    //1. @Before
    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice() {
        System.out.println("I'm @Before aspect, I'm asked to get executed before " +
                "addAccount() :( \n As I am aspect, I'm a huge burden to the server, I don't want to be :'(  ");
        System.out.println("But hey!! I can help you with loggers :) ");
    }

    @After("execution(public void addAccount())")
    public void afterAddAccountAdvice() {
        System.out.println("I'm @After aspect, I'm asked to get executed " +
                "after said method, irrespective of success or failures..");
    }

    @AfterReturning("execution(public void addAccount())")
    public void afterSuccessAddAccountAdvice() {
        System.out.println("I'm @AfterReturning aspect, I'm asked to get executed after successful execution of said method..");
    }

    @AfterThrowing("execution(public void addAccountFailure())")
    public void afterFailureAddAccountAdvice() {
        System.out.println("I'm @AfterThrowing aspect, I'm asked to get executed after failed execution of said method..");
    }



}

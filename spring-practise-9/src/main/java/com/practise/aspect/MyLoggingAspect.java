package com.practise.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
}

package com.practise.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 16/09/2017.
 */
@Aspect
@Component
public class MyLoggingAspect {

    @Pointcut("execution(* com.practise.dao.*.*(..))")
    public void declaringPointcutForDaoPkg() {

    }

    @Before("declaringPointcutForDaoPkg()")
    public void beforeAnyMethodInDao() {
        System.out.println("Before any method");
    }

}

package com.practise.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

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
    public void beforeAnyMethodInDao(JoinPoint joinPoint) {
        System.out.println("Before any method");
        //TODO 040: display method signature and arguments
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method signature: " +methodSignature);

        Object[] arguments = joinPoint.getArgs();

        for(Object tempArg : arguments) {
            System.out.println("This is printed from Aspect, tempArg: " +tempArg);
        }
    }

}

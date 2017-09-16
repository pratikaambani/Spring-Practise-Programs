package com.practise.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 16/09/2017.
 */
@Aspect
@Component
public class MyLoggingAspect {

    //TODO 038: pointcut DECLARATION, to be used at multiple places
    @Pointcut("execution(* com.practise.dao.*.*(..))")
    public void declaringPointcutForDaoPkg() {

    }

    //TODO 038: Look this, ;)
    @Before("declaringPointcutForDaoPkg()")
    //TODO 038: pointcut DECLARATION, to be used at multiple places
    public void beforeAnyMethodInDao() {
        System.out.println("Before any method");
    }

}

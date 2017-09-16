package com.practise.aspect;

import org.aspectj.lang.JoinPoint;
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
/*
    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice() {
        System.out.println("I'm @Before aspect, I'm asked to get executed before " +
                "addAccount() :( \n As I am aspect, I'm a huge burden to the server, I don't want to be :'(  ");
        System.out.println("But hey!! I can help you with loggers :) ");
    }
*/

/*
    @After("execution(public void addAccount())")
    public void afterAddAccountAdvice() {
        System.out.println("I'm @After aspect, I'm asked to get executed " +
                "after said method, irrespective of success or failures..");
    }
*/

/*
    @AfterReturning("execution(public void addAccount())")
    public void afterSuccessAddAccountAdvice() {
        System.out.println("I'm @AfterReturning aspect, I'm asked to get executed after successful execution of said method..");
    }
*/

/*
    @AfterThrowing("execution(public void addAccountFailure())")
    public void afterFailureAddAccountAdvice() {
        System.out.println("I'm @AfterThrowing aspect, I'm asked to get executed after failed execution of said method..");
    }
*/

    @AfterReturning(pointcut = "execution(* *add*(..))", returning = "myresult1")
//    @AfterReturning("execution(public void *add*())")
    public void afterSuccessAddAccountAdvice(JoinPoint joinPoint, String myresult1) {
        System.out.println("@AfterReturning aspect  \n");
        System.out.println("Method name: " +joinPoint.getSignature().toShortString()+ "\n");
        System.out.println("Retrieving values from method in advice, myresult1: " +myresult1);
        convertItToUppercase(myresult1);
    }

    private void convertItToUppercase(String myresult1) {
        myresult1.toUpperCase();
    }


    //--------------------------------------Practise--------------------------------------

/*
    @Before("execution(public void *add*())")
    //TODO 037: This will be executed for any method containing "add"
    public void beforeAddAspect() {
        System.out.println("Practise 1: This will be executed for any method containing \"add\"");
    }
*/

/*
    @Before("execution(public void *add*())")
    //TODO 037: This will be executed for any method containing "addAccount" inside any class
    public void beforeAddAspectAnyClass() {
        System.out.println("Practise 1: This will be executed for any method containing \"addAccount\" inside any class");
    }
*/

/*
    @Before("execution(public void com.practise.dao.MembershipDAO.addAccount())")
    //TODO 037: This will be executed for "addAccount" method inside only MembershipDAO class
    public void beforeAddAspectAnyClass() {
        System.out.println("Practise 1: This will be executed for "addAccount" method inside only MembershipDAO class");
    }
*/

/*
    @Before("execution(public * *addAccount())")
    //TODO 037: This will be executed for any method named "addAccount" having/containing  "any type"
    public void beforeAddAspectAnyClass() {
        System.out.println("Practise 1: This will be executed for any method named \"addAccount\" having/containing  \"any type\"");
    }
*/



/*
    @Before("execution(public void com.practise.dao.AccountDAO.addAccount(..))")
    //TODO 038: matches all method irrespective of nubmer of arguments in mentioned class
    public void beforeAddAccountAdviceMultipleParams() {
        System.out.println("Practise 1: I'm @Before aspect, I'm asked to get executed before " +
                "addAccount() :( \n As I am aspect, I'm a huge burden to the server, I don't want to be :'(  ");
        System.out.println("But hey!! I can help you with loggers :) ");
    }
*/

}

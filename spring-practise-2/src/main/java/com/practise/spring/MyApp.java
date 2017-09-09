package com.practise.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class MyApp {
    public static void main(String[] args) {

        String applicationContextPath = "applicationContext.xml";

        //reading from configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext(applicationContextPath);
        Coach myCoach = (Coach) context.getBean("myCoachBean", Coach.class);
        System.out.println(myCoach.getDailyWorkout());

        System.out.println(myCoach.getDailyFortune());

        //TODO 004:
        CricketCoach cktCoach = context.getBean("myCktCoach", CricketCoach.class);
        System.out.println(cktCoach.getDailyWorkout());
        //TODO 005: Reading literal values from xml file
        System.out.println("Reading literal values from xml file");
        System.out.println("Name: " +cktCoach.getName()+ " and Team: " +cktCoach.getTeam());
    }
}

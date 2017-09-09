package com.practise.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("thatSillyCoach", TennisCoach.class);
        System.out.println(coach.getDailyWorkout());
    }
}

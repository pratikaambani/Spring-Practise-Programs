package com.practise.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class MyApp {
    public static void main(String[] args) {

        String applicationContextPath = "applicationContext.xml";

        Coach coach1 = new BaseballCoach();
        System.out.println(coach1.getDailyWorkout());

        Coach coach2 = new CricketCoach();
        System.out.println(coach2.getDailyWorkout());


/*
        ApplicationContext context = new ClassPathXmlApplicationContext(applicationContextPath);

        Coach myCoach = (Coach) context.getBean("myCoachBean", Coach.class);
        System.out.println(myCoach.getDailyWorkout());
*/

    }
}

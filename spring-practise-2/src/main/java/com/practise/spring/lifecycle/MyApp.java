package com.practise.spring.lifecycle;

import com.practise.spring.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class MyApp {

    public static void main(String[] args) {
        String applicationContextPath = "beanlifecycle-applicationContext.xml";

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(applicationContextPath);
        Coach coach = context.getBean("myCoachBean", Coach.class);
        System.out.println(coach.getDailyWorkout());
        context.close();

    }
}

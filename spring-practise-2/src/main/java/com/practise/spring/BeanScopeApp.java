package com.practise.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class BeanScopeApp {
    public static void main(String[] args) {

        String applicationContextPath = "beanscope-applicationContext.xml";

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(applicationContextPath);

        //TODO 007: Bean Scopes
        Coach coach = context.getBean("myCoachBean", Coach.class);
        Coach alphaCoach = context.getBean("myCoachBean", Coach.class);

        //Lets check if both are same beans, also test by changing scope in
        // beanscope-applicationContext.xml to prototype
        System.out.println("coach: " +coach);
        System.out.println("alphaCoach: " +alphaCoach);

        System.out.println("Similarity: " +(coach == alphaCoach));

        context.close();
    }
}

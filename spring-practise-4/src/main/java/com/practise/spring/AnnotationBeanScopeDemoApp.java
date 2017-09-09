package com.practise.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        String applicationContextPath = "applicationContext.xml";

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(applicationContextPath);

        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println("coach: " + coach);
        System.out.println("alphaCoach: " + alphaCoach);

        System.out.println("Similarity: " + (coach == alphaCoach));

        context.close();


    }
}

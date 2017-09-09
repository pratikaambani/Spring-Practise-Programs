package com.practise.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class JavaConfigDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = annotationContext.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = annotationContext.getBean("tennisCoach", Coach.class);

        System.out.println("coach: " + coach);
        System.out.println("alphaCoach: " + alphaCoach);

        System.out.println("Similarity: " + (coach == alphaCoach));

        annotationContext.close();


    }

}

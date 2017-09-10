package com.practise.spring.annotation;

import com.practise.spring.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class JavaConfigDemo {
    public static void main(String[] args) {
        //TODO 019: Wiping out xmls totally
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(SportConfig.class);

        System.out.println("reading pkgs and other values from Sport Config instead of an XML.");
        Coach coach = annotationContext.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = annotationContext.getBean("tennisCoach", Coach.class);

        System.out.println("coach: " + coach);
        System.out.println("alphaCoach: " + alphaCoach);

        System.out.println("Similarity: " + (coach == alphaCoach));

        annotationContext.close();


    }

}

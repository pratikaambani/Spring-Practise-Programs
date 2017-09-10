package com.practise.spring.bean;

import com.practise.spring.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(SportsConfig.class);

        //TODO 020: swimmingCoach will be same as method defined in SwimCoach#@Beans
        Coach coach = annotationContext.getBean("swimmingCoach", Coach.class);

        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());

        annotationContext.close();


    }

}
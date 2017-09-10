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

		//TODO 021: Injecting values from props
        SwimCoach swimCoach = annotationContext.getBean("swimmingCoach", SwimCoach.class);

        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());

        System.out.println("Values are retrieved from props file \n username: " +swimCoach.getName()+ " and email: " +swimCoach.getEmailId());

        annotationContext.close();


    }

}
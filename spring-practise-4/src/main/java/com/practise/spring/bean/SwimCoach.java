package com.practise.spring.bean;

import com.practise.spring.Coach;
import com.practise.spring.FortuneService;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Pratik Ambani on 10/09/2017.
 */
public class SwimCoach implements Coach {

    //TODO 021: Injecting values from props
    @Value("${user.firstname}")
    private String name;

    @Value("${user.emailId}")
    private String emailId;

    private FortuneService service;

    public SwimCoach(FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim for 1km daily";
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }

    //TODO 021: Injecting values from props
    public String getName() {
        return name;
    }

    //TODO 021: Injecting values from props
    public String getEmailId() {
        return emailId;
    }
}

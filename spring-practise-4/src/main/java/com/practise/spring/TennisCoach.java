package com.practise.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
@Component
//TODO 018: Scopes via annotations | default is singleton
@Scope(value = "prototype")
public class TennisCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("This is default constructor.");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise forehand properly";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

package com.practise.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
@Component
//TODO 018: Scopes via annotations | default is singleton
@Scope(value = "prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
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

    @PostConstruct
    public void customInitMethod() {
        System.out.println("executed during Initialization");
    }

    @PreDestroy
    public void customDestroyMethod() {
        System.out.println("executed before destruction");
    }
}

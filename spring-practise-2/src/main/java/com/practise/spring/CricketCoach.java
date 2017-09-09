package com.practise.spring;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class CricketCoach implements Coach {

    public FortuneService service;

    public CricketCoach() {
    }

    public String getDailyWorkout() {
        return "Practise fast bowling re!!";
    }

    public String getDailyFortune() {
        return service.getDailyFortune();
    }

    public void setService(FortuneService service) {
        System.out.println("Setting up values");
        this.service = service;
    }
}

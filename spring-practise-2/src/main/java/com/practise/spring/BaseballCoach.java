package com.practise.spring;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Spend 30 mins daily on baseball practise";
    }

    //TODO 003: injected fortune service
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    //TODO 009: Custom init and destroy methods
    public void customInitMethod() {
        System.out.println("This will be executed at initialization");
    }

    public void customDestroyMethod() {
        System.out.println("This will be executed before destruction of bean");
    }


}

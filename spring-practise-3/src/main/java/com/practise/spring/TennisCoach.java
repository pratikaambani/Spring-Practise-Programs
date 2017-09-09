package com.practise.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
//TODO 011: Default bean id by removing custom bean ID in TennisCoach class
@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("This is default constructor.");
    }

    /*
    //TODO 012: Added constructor level DI
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
*/

    @Override
    public String getDailyWorkout() {
        return "Practise forehand properly";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    //correction in git commit
    //TODO 013: Added setter based DI
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}

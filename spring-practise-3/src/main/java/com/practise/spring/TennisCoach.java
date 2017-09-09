package com.practise.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
//TODO 011: Default bean id by removing custom bean ID in TennisCoach class
@Component
public class TennisCoach implements Coach {

    //TODO 015: field level DI
    @Autowired
    //TODO 016: using Qualifier to explicitly specify which bean will be qualified, as
    // SadFortuneService is also in competition with HappyFortuneService
    @Qualifier("happyFortuneService")
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
/*
    @Autowired
    //TODO 014: Any method name apart from setter
    public void randomMethodInsteadOfSetter(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
*/
}

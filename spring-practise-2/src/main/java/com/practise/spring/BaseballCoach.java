package com.practise.spring;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins daily on baseball practise";
    }
}

package com.practise.spring;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 60 mins daily on cricket practise";
    }
}

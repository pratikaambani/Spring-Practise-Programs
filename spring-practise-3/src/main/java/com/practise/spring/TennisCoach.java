package com.practise.spring;

import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
//TODO 011: Default bean id by removing custom bean ID in TennisCoach class
@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practise forehand properly";
    }
}

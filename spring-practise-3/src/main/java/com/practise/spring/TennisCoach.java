package com.practise.spring;

import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
@Component("thatSillyCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practise forehand properly";
    }
}

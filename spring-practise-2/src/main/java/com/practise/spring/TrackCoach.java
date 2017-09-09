package com.practise.spring;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class TrackCoach implements Coach {

    private FortuneService service;

    public TrackCoach(FortuneService service) {
        this.service = service;
    }

    public String getDailyWorkout() {
        return "Run 5 KM";
    }

    public String getDailyFortune() {
        return "Just do it: " +service.getDailyFortune();
    }
}

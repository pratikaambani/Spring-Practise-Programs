package com.practise.spring;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class HappyFortuneService implements FortuneService{

    public String getDailyFortune() {
        return "Today is your lucky day";
    }
}

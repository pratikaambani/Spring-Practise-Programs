package com.practise.spring;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class MyApp {
    public static void main(String[] args) {

        BaseballCoach coach = new BaseballCoach();

        System.out.println(coach.getDailyWorkout());
    }
}

package com.practise.spring;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class MyApp {
    public static void main(String[] args) {

        Coach coach1 = new BaseballCoach();
        System.out.println(coach1.getDailyWorkout());

        Coach coach2 = new CricketCoach();
        System.out.println(coach2.getDailyWorkout());
    }
}

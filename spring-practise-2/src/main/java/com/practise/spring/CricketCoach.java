package com.practise.spring;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
public class CricketCoach implements Coach {

    private String name;
    private String team;

    public FortuneService service;

    public CricketCoach() {
    }

    public String getDailyWorkout() {
        return "Practise fast bowling re!!";
    }

    public String getDailyFortune() {
        return service.getDailyFortune();
    }

    public void setService(FortuneService service) {
        System.out.println("Setting up values");
        this.service = service;
    }

    //TODO 004: setter based dependency
    public void setName(String name) {
        System.out.println("Inside setName of Cricket");
        this.name = name;
    }

    public void setTeam(String team) {
        System.out.println("Inside setTeam of Cricket");
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }
}

package com.practise.spring.bean;

import com.practise.spring.Coach;
import com.practise.spring.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

/**
 * Created by Pratik Ambani on 10/09/2017.
 */
public class SwimCoach implements Coach {

    private FortuneService service;

    public SwimCoach(FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim for 1km daily";
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }
}

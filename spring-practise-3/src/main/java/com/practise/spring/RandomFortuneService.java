package com.practise.spring;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
@Component
public class RandomFortuneService implements FortuneService{

    private String[] data = {
            "Good Morning",
            "Good Afternoon",
            "Good Evening",
            "Good Night",
    };

    private Random random = new Random();

    @Override
    public String getFortune() {
        return data[random.nextInt(data.length)];
    }
}

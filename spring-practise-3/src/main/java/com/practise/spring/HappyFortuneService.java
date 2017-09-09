package com.practise.spring;

import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Voillaa!! Today is awesome.. :)";
    }
}

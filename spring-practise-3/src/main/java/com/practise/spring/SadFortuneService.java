package com.practise.spring;

import org.springframework.stereotype.Component;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
@Component
public class SadFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Oh Beep!! Today was shit.. :)";
    }
}

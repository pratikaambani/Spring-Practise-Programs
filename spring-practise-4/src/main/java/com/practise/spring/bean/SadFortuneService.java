package com.practise.spring.bean;

import com.practise.spring.FortuneService;

/**
 * Created by Pratik Ambani on 10/09/2017.
 */
public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Sad day... :( ";
    }
}

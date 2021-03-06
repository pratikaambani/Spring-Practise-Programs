package com.practise.spring.bean;

import com.practise.spring.Coach;
import com.practise.spring.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Pratik Ambani on 9/09/2017.
 */
@Configuration
@ComponentScan("com.practise.spring")
//TODO 021: Injecting values from props
@PropertySource("classpath:app.properties")
public class SportsConfig {

    //TODO 020: Defining beans
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //TODO 020: Defining beans
    @Bean
    public Coach swimmingCoach() {
        return new SwimCoach(sadFortuneService());
    }

}

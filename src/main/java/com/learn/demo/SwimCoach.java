package com.learn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{
    private FortuneService fortuneService;
    @Autowired
    public SwimCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;

    }

    @Override
    public String getDailyWorkout() {
        return "Swim Swim Swim!";
    }

    @Override
    public String gteDailyFortune() {
        return fortuneService.getFortune();
    }
}

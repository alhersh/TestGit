package com.learn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

/*    @Autowired
    public TennisCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;

    }*/
    public TennisCoach(){
        System.out.println(">> inside TennisCoach :: Default constructor");
    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService){
        System.out.println(">> inside TennisCoach :: setter");
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Practice your hand volley!";
    }

    @Override
    public String gteDailyFortune() {
        return fortuneService.getFortune();
    }


}

package com.learn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		//read spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//read bean from container
		Coach tCoach = context.getBean("tennisCoach", Coach.class);
		//Coach sCoach = context.getBean("swimCoach", Coach.class);
		//call a method on the bean
		//System.out.println(tCoach.getDailyWorkout());
		//System.out.println(tCoach.gteDailyFortune());

		//System.out.println(sCoach.getDailyWorkout());
		//System.out.println(sCoach.gteDailyFortune());

		// Service
		//HappyFortuneService happyFortuneService = new HappyFortuneService();
		//happyFortuneService.getFortune();
		//close context
		context.close();
	}

}

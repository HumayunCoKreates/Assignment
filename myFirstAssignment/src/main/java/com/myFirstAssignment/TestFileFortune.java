package com.myFirstAssignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFileFortune {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation.xml");
    	Coach coach=context.getBean("fileBaseBallCoach", Coach.class);
    	coach.doDailyWork();
    	coach.getFortune();
    	context.close();

	}

}

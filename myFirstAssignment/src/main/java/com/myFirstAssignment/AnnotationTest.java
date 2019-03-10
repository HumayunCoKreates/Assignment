package com.myFirstAssignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation.xml");
    	Coach coach=context.getBean("footballCoachAnnotation", Coach.class);
    	coach.doDailyWork();
    	coach.getFortune();
    	context.close();

	}

}

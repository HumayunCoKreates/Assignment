package com.myFirstAssignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopePractice {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean-scopeApplicationContext.xml");
    	FortuneService fortuneService1=context.getBean("myFortune", FortuneService.class);
    	FortuneService fortuneService2=context.getBean("myFortune", FortuneService.class);
    	
    	boolean b=(fortuneService1==fortuneService2);
    	System.out.println(b);
    	context.close();
	}

}

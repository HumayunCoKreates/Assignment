package com.myFirstAssignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
    	Coach coach=context.getBean("cricketCoach", Coach.class);
    	coach.doDailyWork();
    	context.close();
    }
}

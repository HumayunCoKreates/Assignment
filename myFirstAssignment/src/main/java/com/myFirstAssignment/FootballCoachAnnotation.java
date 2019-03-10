package com.myFirstAssignment;

import org.springframework.stereotype.Component;

@Component
public class FootballCoachAnnotation implements Coach {

	public void doDailyWork() {
		System.out.println("Do some practice");

	}

	public void getFortune() {
		System.out.println("Good luck");

	}

}

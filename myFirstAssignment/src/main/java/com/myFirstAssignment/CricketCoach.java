package com.myFirstAssignment;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
	public CricketCoach() {
		
	}

	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	public void doDailyWork() {
		System.out.println("Do some batting practice");

	}
	public void getFortune() {
		System.out.println(fortuneService.getFortuneService());
	};

}

package com.myFirstAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class HockeyCoachAnnotation implements Coach {

	@Autowired
	@Qualifier("fileFortune")
	private FileFortuneService fileFortuneService;
	
	
	
	public HockeyCoachAnnotation(FileFortuneService fileFortuneService) {
		this.fileFortuneService = fileFortuneService;
	}

	@Override
	public void doDailyWork() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getFortune() {
		// TODO Auto-generated method stub

	}

}

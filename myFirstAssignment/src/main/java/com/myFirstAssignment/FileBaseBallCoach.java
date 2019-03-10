package com.myFirstAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FileBaseBallCoach implements Coach {

	
	@Autowired
	@Qualifier("fileFortune")
	private FileFortuneService fileFortuneService;
	
	
	
	public FileBaseBallCoach(FileFortuneService fileFortuneService) {
		this.fileFortuneService = fileFortuneService;
	}
	
	public void doDailyWork() {
		System.out.println("Do some physical excercise");

	}

	public void getFortune() {
		System.out.println(fileFortuneService.fileFortune());

	}

}

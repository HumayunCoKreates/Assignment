package com.myFirstAssignment;

import java.util.Random;

public class MyFortune implements FortuneService{

	private String[] fortune= {"Hard Parctice","Average Practice","Normal Practrice"};
	
	public String getFortuneService() {
		Random random=new Random();
		
		int index=random.nextInt(fortune.length);
		return fortune[index];

	}

}

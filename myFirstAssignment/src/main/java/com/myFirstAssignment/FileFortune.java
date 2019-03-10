package com.myFirstAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortune implements FileFortuneService {

	private String fileName = "C:/Users/LENOVO/Desktop/Remote/Assignment/myFirstAssignment/src/main/java/fortune.txt";
	private List<String> theFortunes;

	// create a random number generator
	private Random myRandom = new Random();
	
	
	public FileFortune() {

		File theFile = new File(fileName);
		
		
		// initialize array list
		theFortunes = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String temp;

			while ((temp = br.readLine()) != null) {
				theFortunes.add(temp);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String fileFortune() {
		int index = myRandom.nextInt(theFortunes.size());

		String temporaryFortune = theFortunes.get(index);

		return temporaryFortune;
		
	}

	

}

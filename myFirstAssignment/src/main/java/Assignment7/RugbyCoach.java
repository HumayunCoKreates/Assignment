package Assignment7;

import org.springframework.stereotype.Component;

import Assignment7.Coach;


@Component("rugbyCoach")
public class RugbyCoach implements Coach {

	
	private FortuneService fortuneService;

	
	public RugbyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String doDailyWork() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fortuneServe() {
		
		return fortuneService.provideFortune();
	}

	

}

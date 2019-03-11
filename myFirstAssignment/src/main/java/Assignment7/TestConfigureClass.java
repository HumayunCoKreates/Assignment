package Assignment7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestConfigureClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
    	Coach coach=context.getBean("rugbyCoach", Coach.class);
    	
    	System.out.println(coach.fortuneServe());
    	
    	context.close();

	}

}

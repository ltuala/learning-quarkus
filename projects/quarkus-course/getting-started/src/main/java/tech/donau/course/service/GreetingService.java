package tech.donau.course.service;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import tech.donau.course.service.config.GreetingConfig;

@ApplicationScoped
public class GreetingService {
	
	@Inject
	GreetingConfig greetingConfig;
	
	public String sayHello() {
		
		return greetingConfig.getPrefix().orElse("_") 
				+ greetingConfig.getName() 
				+ greetingConfig.getSuffix() 
				+ " Your country is " + greetingConfig.getCountry().getName();
	}
				
	public String sayHello(String name) {
		return String.format("Hello %s, your id is %s",
        		name,
        		UUID.randomUUID().toString()
        );
	}

}

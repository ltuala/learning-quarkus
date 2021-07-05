package tech.donau.course.service;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.test.Mock;

@Mock
@ApplicationScoped
public class MockGreetingService extends GreetingService {

	@Override
	public String sayHello(String name) {
		return String.format("Hello %s, your id is %s",
        		name,
        		"1234"
        );
	}
	
}

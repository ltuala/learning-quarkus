package tech.donau.course;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tech.donau.course.service.GreetingService;

@Path("/hello")
public class GreetingResource {
	
	@Inject
	private GreetingService greetingService;
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return greetingService.sayHello();
	}
	
    @GET
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("name") String name) {
        return greetingService.sayHello(name);
    }
    
}
package tech.donau.course

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.inject.Inject
import javax.enterprise.inject.Default
import javax.ws.rs.PathParam

@Path("/hello")
class GreetingResource {
	
	@Inject
	lateinit var greetingService: GreetingService
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello"
	
	@GET
	@Path("/greeting/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	fun greet(@PathParam("name") name: String): Greeting {
		return Greeting(greetingService.greet(name));
	}
}
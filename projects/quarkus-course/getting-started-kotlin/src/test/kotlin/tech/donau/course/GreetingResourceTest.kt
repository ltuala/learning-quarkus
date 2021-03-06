package tech.donau.course

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class GreetingResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/C:/Program Files/Git/hello")
          .then()
             .statusCode(200)
             .body(`is`("hello"))
    }

}
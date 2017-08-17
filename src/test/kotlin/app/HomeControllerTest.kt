package app

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GreetingControllerIntegrationTests {

    @Autowired
    lateinit var restTemplate: TestRestTemplate

    @Test
    fun `GET when given George then returns "Hello, Tester"`() {

        val name = "Tester"

        val body = restTemplate.getForObject("/home/{name}", String::class.java, name)

        assertThat(body).isEqualTo("Hello, $name")

    }

}
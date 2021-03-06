package app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/home/{name}")
    fun get(@PathVariable name: String) = "Hello, $name"

}
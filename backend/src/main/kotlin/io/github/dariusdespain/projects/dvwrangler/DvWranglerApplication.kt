package io.github.dariusdespain.projects.dvwrangler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DvWranglerApplication

fun main(args: Array<String>) {
    runApplication<DvWranglerApplication>(*args)
}

@RestController
class DvWranglerController {
    @PostMapping("/api/filter-registration")
    fun filterRegistration() {
        println("Filtering registration")
    }
}
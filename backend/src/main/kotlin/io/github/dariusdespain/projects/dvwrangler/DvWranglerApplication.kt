package io.github.dariusdespain.projects.dvwrangler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DvWranglerApplication

fun main(args: Array<String>) {
    runApplication<DvWranglerApplication>(*args)
}

package com.cs.sigm.person

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PersonServiceApplication

fun main(args: Array<String>) {
    runApplication<PersonServiceApplication>(*args)
}

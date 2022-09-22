package com.example.keycloakclientserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KeycloakClientServerApplication

fun main(args: Array<String>) {
    runApplication<KeycloakClientServerApplication>(*args)
}

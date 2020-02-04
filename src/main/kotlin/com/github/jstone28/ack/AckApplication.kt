package com.github.jstone28.ack

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AckApplication

fun main(args: Array<String>) {
	runApplication<AckApplication>(*args)
}

package com.sanskrit.api

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun main() {
    embeddedServer(Netty, port = 8080) {
        module()
    }.start(wait = true)
}

fun Application.module() {
    routing {
        get("/test") {
            call.respondText("Hello, Ktor!")
        }
    }
}
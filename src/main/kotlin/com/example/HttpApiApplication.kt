package com.example

import com.example.httpapi.routes.registerCustomerRoutes
import com.example.httpapi.routes.registerOrderRoutes
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.CORS
import io.ktor.features.ContentNegotiation
import io.ktor.serialization.json
import io.ktor.server.netty.EngineMain

fun main(args: Array<String>) = EngineMain.main(args)

fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation) {
        json()
    }
    install(CORS) {
        anyHost()
    }
    registerCustomerRoutes()
    registerOrderRoutes()
}

package com.example

import com.example.database.DatabaseConnection
import com.example.database.databaseSkills
import com.example.plugins.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.requestvalidation.*
import io.ktor.server.routing.*
import org.ktorm.database.Database

fun main(args: Array<String>) {
    embeddedServer(Netty, port = 8080, module = Application::module).start(wait = true)
}

fun Application.module() {
    install(ContentNegotiation){
        json()
    }
    install(RequestValidation){

    }

   val db =  DatabaseConnection.database

    configureRouting()




}

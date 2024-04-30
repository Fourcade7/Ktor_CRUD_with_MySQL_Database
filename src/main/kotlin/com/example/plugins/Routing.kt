package com.example.plugins

import com.example.model.Yandex

import com.example.routing.noteRoutes
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        getdata()
        setData()
        noteRoutes()


    }


}




fun Routing.getdata(){

    get("/yandex") {

        call.respondText("YANDEX GO")
    }
}

fun Routing.setData(){
    post("/yandexgo"){
        val response = call.receive<Yandex>()
        println(response)
        val resanswer=Yandex(response.id,response.email)
        call.respond(resanswer)
    }
}

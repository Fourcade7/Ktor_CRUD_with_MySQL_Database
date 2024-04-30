package com.example.routing

import com.example.database.DatabaseConnection
import com.example.database.tableModel.Note
import com.example.database.tableModel.NotesResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.ktorm.dsl.*


fun Routing.noteRoutes() {
    val db = DatabaseConnection.database

    get("/getallnotes") {

        val notes = db.from(Note).select()
//            .map {
//                val id = it[Note.id]
//                val note = it[Note.note]
//                NotesResponse(id = id ?: -1, note = note ?: "")
//            }
        val notes2 = mutableListOf<NotesResponse>()
        for (note in notes) {
            notes2.add(NotesResponse(id = note[Note.id] ?: -1, note = note[Note.note] ?: ""))
        }

        call.respond(notes2.reversed())

    }

    post("/addnotes") {
        val data = call.receive<NotesResponse>()
        val insert = db.insert(Note) {
            set(it.id, 0)
            set(it.note, data.note)
        }

        if (data.note is String) {
            call.respond(HttpStatusCode.OK, "added")
        } else {
            call.respond(HttpStatusCode.BadRequest, "bad")
        }

    }


    get("getnote/{id}") {
        val id=call.parameters.get("id")?.toInt()?:-1

        val notebyid= db.from(Note).select()
            .where{Note.id eq id}
            .map {
                val idd=it[Note.id]
                val note=it[Note.note]
                NotesResponse(id = idd!!,note=note!!)
            }.firstOrNull()


        if (notebyid!=null){
            call.respond(HttpStatusCode.OK,notebyid)
        }else{
            call.respond(HttpStatusCode.NotFound,NotesResponse(id=0, note = "Not Found"))
        }

    }

    put("/updatenote/{id}"){
        val id=call.parameters.get("id")?.toInt()?:-1
        val updatenote=call.receive<NotesResponse>()

        val updateedit=db.update(Note){
            set(it.note,updatenote.note)
            where {
                it.id eq id
            }
        }

        if (updateedit==1){
            call.respondText("Updated")
        }else{
            call.respondText("False")
        }
    }
    delete("/deletenote/{id}") {
        val id=call.parameters.get("id")?.toInt()?:-1
        val del = db.delete(Note){
            it.id eq id
        }

        if (del==1){
            call.respondText("Deleted")
        }else{
            call.respondText("False")
        }
    }





}
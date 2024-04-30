package com.example.database.tableModel

import kotlinx.serialization.Serializable


@Serializable
data class NotesResponse constructor(
    val id:Int,
    val note:String
)

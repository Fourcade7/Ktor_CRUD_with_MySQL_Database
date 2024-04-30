package com.example.database.tableModel

import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object Note : Table<Nothing>("f7notes") {
    val id = int("id").primaryKey()
    val note = varchar("note")

}
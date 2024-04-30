package com.example.database.tableModel

import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object User : Table<Nothing>("Workers") {
    val id = int("id").primaryKey()
    val name = varchar("name")

}

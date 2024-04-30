package com.example.database

import org.ktorm.database.Database

object DatabaseConnection {

    val database:Database = Database.connect(
        url = "jdbc:mysql://localhost:8889/Notes",
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root",
        password = "root"
    )
}
New Project

        
        https://start.ktor.io/?_ga=2.173136099.1139195154.1714301259-811798944.1714077046&_gl=1*15r6u05*_ga*ODExNzk4OTQ0LjE3MTQwNzcwNDY.*_ga_9J976DJZ68*MTcxNDQ3NTYyNi4xNi4xLjE3MTQ0NzU2MzEuNTUuMC4w



Json Serialization

        plugins {
            kotlin("jvm") version "1.9.23"
            id("io.ktor.plugin") version "2.3.10"
            kotlin("plugin.serialization") version "1.9.23" //https://kotlinlang.org/docs/serialization.html#add-plugins-and-dependencies
        }
        //https://ktor.io/docs/serialization.html#serialization_dependency
        implementation("io.ktor:ktor-server-content-negotiation:$ktor_version")
        implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")

Database Connection MySql

        // https://mvnrepository.com/artifact/org.ktorm/ktorm-core
        implementation("org.ktorm:ktorm-core:3.6.0")
        // https://mvnrepository.com/artifact/com.mysql/mysql-connector-j
        implementation("com.mysql:mysql-connector-j:8.3.0")

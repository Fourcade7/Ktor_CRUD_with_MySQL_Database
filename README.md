Json Serialization

        plugins {
            kotlin("jvm") version "1.9.23"
            id("io.ktor.plugin") version "2.3.10"
            kotlin("plugin.serialization") version "1.9.23"
        }

        implementation("io.ktor:ktor-server-content-negotiation:$ktor_version")
        implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")

Database Connection MySql

        // https://mvnrepository.com/artifact/org.ktorm/ktorm-core
        implementation("org.ktorm:ktorm-core:3.6.0")
        // https://mvnrepository.com/artifact/com.mysql/mysql-connector-j
        implementation("com.mysql:mysql-connector-j:8.3.0")

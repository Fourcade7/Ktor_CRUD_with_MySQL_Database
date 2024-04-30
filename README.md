Json Serialization
        plugins {
            kotlin("jvm") version "1.9.23"
            id("io.ktor.plugin") version "2.3.10"
            kotlin("plugin.serialization") version "1.9.23"
        }

        implementation("io.ktor:ktor-server-content-negotiation:$ktor_version")
        implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")

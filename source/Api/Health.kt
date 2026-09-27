plugins {
    kotlin("jvm")
    kotlin("plugin.serialization") version "2.2.20"
    id("io.ktor.plugin")
    application
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:3.3.0")
    implementation("io.ktor:ktor-server-netty-jvm:3.3.0")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:3.3.0")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:3.3.0")

    testImplementation("io.ktor:ktor-server-test-host-jvm:3.3.0")
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("ApplicationKt")
}

kotlin {
    jvmToolchain(21)
}

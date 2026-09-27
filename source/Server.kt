plugins {
    kotlin("jvm")
    id("io.ktor.plugin")
    application
}

application {
    mainClass.set("ApplicationKt")
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:3.3.0")
    implementation("io.ktor:ktor-server-netty-jvm:3.3.0")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:3.3.0")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:3.3.0")

    testImplementation("io.ktor:ktor-server-test-host-jvm:3.3.0")
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

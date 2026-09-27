Here’s a clean build.gradle.kts for the Kotlin monorepo:
plugins {
    kotlin("jvm") version "2.2.20"
    application
}

group = "com.example"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("com.example.MainKt")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}

For the root settings.gradle.kts:
rootProject.name = "KotlinMonorepository"

include(
    ":apps:main",
    ":libs:core",
    ":libs:common"
)

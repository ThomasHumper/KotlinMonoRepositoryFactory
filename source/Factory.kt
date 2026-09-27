package com.example.factory

object Factory {

    fun createApp(): App {
        val repository = Repository()
        val service = Service(repository)

        return App(service)
    }
}

class App(
    private val service: Service
)

class Service(
    private val repository: Repository
)

class Repository
monorepo/
├── apps/
│   └── main/
├── libs/
│   ├── core/
│   └── common/
├── build.gradle.kts
├── settings.gradle.kts
└── Factory.kt

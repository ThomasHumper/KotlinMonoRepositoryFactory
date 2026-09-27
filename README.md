# KotlinMonorepository Factory

A lightweight starting point for building organized Kotlin monorepositories.

## Overview

KotlinMonorepository Factory provides a simple structure for Kotlin projects that contain multiple applications and shared libraries.

The repository is designed around a few straightforward principles:

- Keep applications separate from reusable libraries.
- Centralize shared functionality.
- Make dependencies explicit.
- Keep the project easy to extend.
- Avoid unnecessary architectural complexity.

## Structure

```text
monorepo/
├── apps/
│   └── main/
├── libs/
│   ├── core/
│   └── common/
├── build.gradle.kts
├── settings.gradle.kts
└── Factory.kt
```

## Factory

`Factory.kt` contains the basic object-creation logic for the application:

```kotlin
object Factory {

    fun createApp(): App {
        val repository = Repository()
        val service = Service(repository)

        return App(service)
    }
}
```

This provides a single place where application dependencies can be assembled.

## Getting Started

Clone the repository and open it in IntelliJ IDEA or another Kotlin-compatible IDE.

Then configure the Gradle modules in `settings.gradle.kts` and add applications or libraries as needed.

For example:

```text
apps/
├── api/
├── cli/
└── worker/

libs/
├── core/
├── database/
└── common/
```

## Extending the Project

As the repository grows, additional modules can be added without changing the overall structure.

The factory can also be expanded to construct more complicated dependency graphs:

```kotlin
object Factory {

    fun createApp(): App {
        val repository = Repository()
        val service = Service(repository)

        return App(service)
    }
}
```

## Goals

The project aims to provide:

- A clean Kotlin monorepo foundation
- Simple dependency construction
- Clear module boundaries
- Easy scalability
- Minimal boilerplate

## Status

This project is an early foundation and is intended to evolve as additional tooling and modules are added.
